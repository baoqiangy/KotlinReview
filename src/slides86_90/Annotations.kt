package slides86_90

import kotlin.reflect.full.declaredFunctions
import kotlin.reflect.full.findAnnotation

//@file:JvmName("InteropFish")

class InteropFish {
    companion object{
        @JvmStatic fun interop(){

        }
    }
}

@ImAPlant
class Plant{
    fun trim(){}
    fun fertilize(){}
    @get: OnGet
    var isGrowing : Boolean = true

    @set: OnSet
    var needsFood : Boolean = false

}

fun reflections(){
    val classObj = Plant::class
    for(method in classObj.declaredFunctions){
        println(method.name)
    }

    for(annotation in classObj.annotations){
        println(annotation.annotationClass.simpleName)
    }

    val annotated = classObj.findAnnotation<ImAPlant>()
    annotated?.apply {
        println("Found a plant annotation")
    }
}

fun main() {
    reflections()

    val plant = Plant()
    plant.isGrowing = false
    plant.needsFood = true
}