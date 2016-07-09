package com.jun.chu.java.book.rule2.builder_pattern;

/**
 * builder模式
 * 场景:
 * 遇到多个构造器参数时考虑用的构造器
 *
 *
 * 优点:
 * 1.保证向重叠构造器模式的线程安全性
 * 2.也能保证像javaBean模式那么好的可读性。
 *
 * 步骤
 * 1.
 * 2.
 * 3.
 * Created by chujun on 16/7/9.
 */
public class NutritionFact {
    //食用分量 required
    private int servingSize;
    //required
    private int servings;
    //卡路里 optional
    private int calories;
    //optional
    private int fat;
    //optional
    private int sodium;
    //optional
    private int carbohydrate;

    //不对外提供构造器
    private NutritionFact(Builder builder) {
        this.servingSize=builder.servingSize;
        this.servings=builder.servings;
        this.calories=builder.calories;
        this.fat=builder.fat;
        this.sodium=builder.sodium;
        this.carbohydrate=builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NutritionFact{");
        sb.append("servingSize=").append(servingSize);
        sb.append(", servings=").append(servings);
        sb.append(", calories=").append(calories);
        sb.append(", fat=").append(fat);
        sb.append(", sodium=").append(sodium);
        sb.append(", carbohydrate=").append(carbohydrate);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{
        private int servingSize;
        //required
        private int servings;

        //optional parameters -> initialized to default values
        //卡路里 optional
        private int calories=0;
        //optional
        private int fat=0;
        //optional
        private int sodium=0;
        //optional
        private int carbohydrate=0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            this.calories=val;
            return this;
        }

        public Builder fat(int val){
            this.fat=val;
            return this;
        }

        public Builder sodium(int val){
            this.sodium=val;
            return this;
        }

        public Builder carbohydrate(int val){
            this.carbohydrate=val;
            return this;
        }

        public NutritionFact build(){
            return new NutritionFact(this);
        }
    }
}
