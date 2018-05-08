package by.bsuir.pizzeria.controllers.reviews;

import by.bsuir.pizzeria.beans.users.Reviews;
import by.bsuir.pizzeria.services.reviews.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ReviewsController {

    private ReviewsService reviewsService;

    @GetMapping("/reviews")
    public ResponseEntity getDrinkablesAll(){
        List<Reviews> list = reviewsService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/reviews")
    public ResponseEntity addIngredient(@RequestBody Reviews reviews){
        reviewsService.addReviews(reviews);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/reviews{id}")
    public ResponseEntity deleteSauce(@PathVariable String id){
        reviewsService.deleteReviews(Long.parseLong(id));
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setReviewsService(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }
}
