from flask import Flask, request, jsonify
from datetime import datetime
from flask_sqlalchemy import SQLAlchemy
from flask_cors import CORS

app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"] = 'mysql+pymysql://dhartipatel:toor0073@dhartipatel.mysql.pythonanywhere-services.com/dhartipatel$IWS'
app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

db = SQLAlchemy(app)
CORS(app)

class Userdata(db.Model):
    _tablename_="user_data"

    id=db.Column(db.Integer,primary_key=True)
    name=db.Column(db.String(30),nullable=True)
    Location=db.Column(db.String(30),nullable=True)
    Like_to_be_in=db.Column(db.String(30),nullable=True)
    Family_From=db.Column(db.String(30),nullable=True)
    Birth_date =db.Column(db.DateTime, nullable=True)
    Birth_Place=db.Column(db.String(30),nullable=True)
    live_place=db.Column(db.String(30),nullable=True)
    like_to_live =db.Column(db.String(30),nullable=True)
    significant_grow_place=db.Column(db.String(30),nullable=True)
    compare_place=db.Column(db.String(30),nullable=True)
    Filepath1=db.Column(db.String(30),nullable=True)
    Filepath2=db.Column(db.String(30),nullable=True)


@app.route("/")
def index():
    return "OKKKKKKK"

@app.route("/a", methods=['POST'])
def index2():
    comment = Userdata(name=request.json.get("name"),
                        Location=request.json.get("Location"),
                        Like_to_be_in=request.json.get("Like_to_be_in"),
                        Family_From=request.json.get("Family_From"),
                        Birth_date=request.json.get("Birth_date"),
                        Birth_Place=request.json.get("Birth_Place"),
                        live_place=request.json.get("live_place"),
                        like_to_live=request.json.get("like_to_live"),
                        significant_grow_place=request.json.get("significant_grow_place"),
                        compare_place=request.json.get("compare_place"))
    db.session.add(comment)
    db.session.commit()
    return jsonify({"status": True, "message": "Your data has been recorded successfully."}), 200

if __name__ == "__main__":
    app.config["DEBUG"] = True
    app.run()



