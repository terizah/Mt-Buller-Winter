public class Lesson {
  private String level;
  private double fee;
 
public Lesson (String level, double fee) {
  this.level = level
  this.fee = fee;
}

public String getLevel () {
  return level;
}

public double getFee () {
  return fee;
}

public void setLevel (String lee) {
  this.level = level;
}

public void setFee (double fee) {
  this.fee + fee
 }
}

public void addLessons(Package package, intnumLessons, String level) {
  
  double fee = 0.0;
  if (level.equals("beginner")) {
    fee = 25.0;
  } else if (level.equals("intermediate")) {
    fee = 20.0;
  } else if (level.equals("expert")) {
    fee = 15.0;
  }
    Lesson lesson = new Lesson(level, fee);
    
    for (int i = o; i < numLessons; i++) {
      package.addLesson(lesson);
  }
 }
