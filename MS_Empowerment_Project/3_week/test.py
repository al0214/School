from datetime import datetime


def currentTime():
    now = datetime.now()
    time_string = now.strftime("%Y년 %m월 %d일 %h시 %m분 %s초")
    return print(f'현재 시간은 : {time_string}')


if __name__ == '__main__':
    print(currentTime())
