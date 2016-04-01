package kwic
import java.io._
import scala.io.StdIn
import scala.io.Source
import scala.swing.FileChooser
import scala.collection.mutable.Map
import scala.collection.immutable._
import scala.collection.mutable.ListBuffer


object Kwic {


  def main(args: Array[String]): Unit = {


    readFileLines(fileList)


  }


  // read a given number of files or file paths from user
  println("specify file directory or file path.")
  var fileList: List[java.io.File] = List()
  var fileName = " "
  while (!fileName.isEmpty) {
    fileName = readLine() // read input from user

    var makeFile = new File(fileName)

    if (makeFile.isDirectory) {
      fileList = makeFile.listFiles.filter(_.getName.endsWith(".txt")).toList ++ fileList

    } else if (makeFile.getName.endsWith(".txt")) {
      // if its not a directory just concat it to the file list
      // use split at or getname.endswith to check whether name is a file format
      fileList = makeFile :: fileList
      println(fileList)
    }


  }
  println(fileList)


  // create a function that takes fileList and does something to it


  def readFileLines(fileList: List[File]): Unit = {


    val w2 = """([A-Za-z])+""".r

    var modKeyword: List[String] =  List()
    var filterStopword: List[String] =  List()
    var word2 : scala.List[Serializable] = List()
   // var keyword = scala.collection.mutable.Map[String, List[Int]]()
    //var modKeyword = List()
    for (file <- fileList) {

      var keyword = Source.fromFile(file).getLines().toList





      for(elem <- keyword){
        //
        //
        modKeyword = elem.toString.split("\\s+").mkString(",")::modKeyword
       // print(elem)
        //
      }

      for((e,i) <- modKeyword.zipWithIndex) println(i+" "+e)
//// remove stop words from keyword list
//      var stopword = Source.fromFile("C:\\Users\\genie\\Documents\\Java\\stop_words.txt").getLines().toList
//
//     //var filterStopword = stopword.toSet
//
//
//      for(elem <- stopword){
//
//        filterStopword = elem.toString.split("\\s+").mkString(",")::filterStopword
//
//        // print(elem)
//
//      }
//
//
//
//
//
//
//
//
//
//      var filterStopword2 = stopword.toSet

 //print(modKeyword.filterNot(filterStopword2))


        //keyword.mkString(",")




      }


//      for (elm <- keyword) {
//        print(elm)
//
//      }
//
//
//    }
  }

}

