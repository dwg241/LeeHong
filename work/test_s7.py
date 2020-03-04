from flask import Flask
app = Flask(__name__)
 
## localhost:5000/txt 로 접근하면 다음 부분이 수행됨 
@app.route('/txt')
def read_txt():
    f = open('DB.txt', 'r')
    ## 단 리턴되는 값이 list형태의 타입일 경우 문제가 발생할 수 있음.
    ## 또한 \n이 아니라 </br>으로 처리해야 이해함
    ## 즉 파일을 읽더라도 이 파일을 담을 html template를 만들어두고, render_template 를 사용하는 것이 더 좋음
    return "</br>".join(f.readlines())

if __name__ == '__main__':
    # threaded=True 로 넘기면 multiple plot이 가능해짐
  app.run(host='192.168.0.31',port='5000')