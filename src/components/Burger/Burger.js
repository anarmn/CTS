import React from 'react'
import classes from './Burger.css'
import BurgerIngredient from './BurgerIngredient/BurgerIngredient'

const burger = (props)=>{

    let transformedIngredients = Object.keys(props.ingredients)
        .map(item => {
            return [...Array(props.ingredients[item])].map((_, index)=>{
                return <BurgerIngredient key={item+index} type={item}/> //se populeaza atatea ingrediente de acel tip, cat e lungimea arrayului
            })
        })
        .reduce((arr, element)=>{
            return arr.concat(element)
        }, [])

        if (transformedIngredients.length===0){
            transformedIngredients= <p>Please start adding ingredients!</p>
        }
        
    return (
        <div className={classes.Burger}>
             <BurgerIngredient type="bread-top"/>
             {transformedIngredients}
             <BurgerIngredient type="bread-bottom"/>
        </div>
    )


}

export default burger