package SparkApps



import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object ContarPalabras {



  def main(args: Array[String]):Unit= {


    val inputfile = args(0)
   // val outputfile = args(1)


    System.setProperty("hadoop.home.dir",   "C:\\winutil\\")
    val conf = new SparkConf().setMaster("local[*]").setAppName("ContarPalabras")
    val sc = new SparkContext(conf)

   val input = sc.textFile("C:\\Users\\ASUS\\Desktop\\TraScala\\Ejemplo.txt")
    val words =input.flatMap(_.split(" "))
    val counts =words.map(word => (word , 1)).reduceByKey(_+_)
    //counts.saveAsTextFile(outputfile)

    println(counts)
  }


}
