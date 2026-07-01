let mark=85;
function calculateGrade(mark) {
    if(0<mark<100)
    {
        if(mark>=90)
        {
            console.log("Grade : A+")
        }
       
        else if(90<mark<=75)
        {
            console.log("Grade : A")
        }
         else if(75<mark<=60)
        {
            console.log("Grade : B")
        }
        else if(60<mark<=50)
        {
            console.log("Grade : C")
        }
        else if(mark<50)
        {
            console.log("Grade : Fail")
        }
    }
    
}
calculateGrade();