package Groovy


class ElementCounterGroovy {

    static void main(String[] args){
        def list = [1,3,4,5,1,5,4]
        print(counterElementListToMap(list))
    }

    static def counterElementListToMap(def list){
        def result = [:]
        list.each{
                result[it] = result[it] == null ? 1 : result[it] + 1
        }
        return result
    }
}
