import sqlite3


def create_table():
    connection = sqlite3.connect('students.db')
    cursor = connection.cursor()

    cursor.execute('''CREATE TABLE IF NOT EXISTS students
                      (id INTEGER PRIMARY KEY, name TEXT,
                       age INTEGER, major TEXT)''')

    connection.commit()
    connection.close()


create_table()


def insert_table(name, age, major):
    connection = sqlite3.connect('students.db')
    cursor = connection.cursor()

    cursor.execute('''INSERT INTO students(name, age, major)
                       VALUES(?, ?, ?)''', (name, age, major))
    connection.commit()
    connection.close()


insert_table('john', 21, 'Computer Science')


def query_students():
    connection = sqlite3.connect('students.db')
    cursor = connection.cursor()

    cursor.execute("SELECT * FROM students")
    rows = cursor.fetchall()

    connection.close()

    return rows


print(query_students())


def update_student(student_id, name, age, major):
    connection = sqlite3.connect('students.db')
    cursor = connection.cursor()

    cursor.execute('''UPDATE students SET name = ?, age = ?, major = ? WHERE id = ?''',
                   (name, age, major, student_id))

    connection.commit()
    connection.close()


update_student(1, "jhon", 22, "Data Science")
print(query_students())


def delete_student(student_id):
    connection = sqlite3.connect('students.db')
    cursor = connection.cursor()

    cursor.execute("DELETE FROM students WHERE id = ?", (student_id,))
    connection.commit()
    connection.close()


delete_student(1)
print(query_students())
