// gsap.to(".box1",{
//     x:1100,
//     duration:2,
//     delay:2,
//     rotate:360,
//     backgroundColor:"pink",
//     borderRadius:"50%"
  
// })

// gsap.to(".box2",{
//     x:-1100,
//     duration:2,
//     delay:2,
//     rotate:360,
//     backgroundColor:"yellow",
//     borderRadius:"50%"
    
// })


// gsap.from(".Stagger1",{
//     opacity:0,
//     y:60,
//     delay:4,
//     duration:1,
  
// })

// gsap.from(".Stagger2",{
//     opacity:0,
//     x:60,
//     delay:4,
//     duration:1,
// })



var tl=gsap.timeline()

tl.to(".box1",{
    x:1200,
    rotate:360,
    duration:2,
    delay:1,
   
})


tl.to(".box2",{
    x:1200,
    rotate:360,
    duration:2,
    
    borderRadius:"50%"
   
    
})


tl.to(".box3",{
    x:1200,
    rotate:360,
    duration:2,
    scale:1.2,
    
    
})