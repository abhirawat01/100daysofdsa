function twoSum(nums,target){
    const seen = new Map();
    for(let i = 0; i < nums.length; i++) {
        const numNeeded = target - nums[i];
        if(seen.has(numNeeded))
            return [seen.get(numNeeded), i];
        seen.set(nums[i], i);
    }

    return [];
}

let result = twoSum([1,2,4,5,8],10);
console.log(result);