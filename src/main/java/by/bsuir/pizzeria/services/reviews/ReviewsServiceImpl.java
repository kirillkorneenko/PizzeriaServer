package by.bsuir.pizzeria.services.reviews;

import by.bsuir.pizzeria.beans.users.Reviews;
import by.bsuir.pizzeria.dao.users.ReviewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReviewsServiceImpl implements ReviewsService {

    private ReviewsDao reviewsDao;

    @Override
    @Transactional
    public List<Reviews> getAll() {
        return reviewsDao.getAll();
    }

    @Override
    @Transactional
    public void addReviews(Reviews reviews) {
        reviewsDao.persist(reviews);
    }

    @Override
    public void deleteReviews(Long id) {
        Reviews reviews = reviewsDao.getByKey(id);
        reviewsDao.delete(reviews);
    }

    @Autowired
    public void setReviewsDao(ReviewsDao reviewsDao) {
        this.reviewsDao = reviewsDao;
    }
}
