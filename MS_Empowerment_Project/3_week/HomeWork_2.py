import sqlite3


def create_table():
    connection = sqlite3.connect('HomeWork_2.db')
    cursor = connection.cursor()

    cursor.execute('''CREATE TABLE IF NOT EXISTS HomeWork_2
                      (id INTEGER PRIMARY KEY, name TEXT,
                       age INTEGER, major TEXT)''')

    connection.commit()
    connection.close()


create_table()


def insert_table(name, age, major):
    connection = sqlite3.connect('HomeWork_2.db')
    cursor = connection.cursor()

    cursor.execute('''INSERT INTO HomeWork_2(name, age, major)
                       VALUES(?, ?, ?)''', (name, age, major))
    connection.commit()
    connection.close()


insert_table('kim', 20, 'robotics')
insert_table('', 12, '')
insert_table('', 10, '')
insert_table('lee', 25, 'computer enginnering')


def delete_HomeWork(HomeWork_id):
    connection = sqlite3.connect('HomeWork_2.db')
    cursor = connection.cursor()

    cursor.execute("DELETE FROM HomeWork_2 WHERE id = ?", (HomeWork_id,))
    connection.commit()
    connection.close()


delete_HomeWork(2)
delete_HomeWork(3)


def query_HomeWork():
    connection = sqlite3.connect('HomeWork_2.db')
    cursor = connection.cursor()

    cursor.execute("SELECT * FROM HomeWork_2")
    rows = cursor.fetchall()

    connection.close()

    return rows


print(query_HomeWork())
