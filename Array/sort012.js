var sortColors = function(nums) {

    const arr=[];
    var countZero  = 0;
    var countOne  = 0;
    var countTwo  = 0;
    for(let i = 0;i<nums.length;i++){
        if(nums[i]==0){
            countZero++;
        }
        else if(nums[i]==1){
            countOne++;
        }
        else{
            countTwo++;
        }
    }

    for(let i=0;i<nums.length;i++){
        if(countZero){
            arr.push(0);
            countZero--;
        }
        else if(countOne){
            arr.push(1);
            countOne--;
        }
        else if(countTwo){
            arr.push(2);
            countTwo--;
        }
    }
    return arr;
};

const result = sortColors([1,0,2,0,0,2,1]);
console.log(result);