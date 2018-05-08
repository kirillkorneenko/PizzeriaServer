package by.bsuir.pizzeria.services.reviews;

import by.bsuir.pizzeria.beans.users.Reviews;

import java.util.List;

public interface ReviewsService {
    List<Reviews> getAll();
    void addReviews(Reviews reviews);
    void deleteReviews(Long id);
}
