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
