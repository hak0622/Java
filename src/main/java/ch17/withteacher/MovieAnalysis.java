package ch17.withteacher;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieAnalysis {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("인셉션", "SF", 2010, 8.8),
                new Movie("어벤져스", "액션", 2012, 8.0),
                new Movie("기생충", "드라마", 2019, 8.6),
                new Movie("매트릭스", "SF", 1999, 8.7),
                new Movie("인터스텔라", "SF", 2014, 8.6),
                new Movie("다크나이트", "액션", 2008, 9.0),
                new Movie("어바웃타임", "로맨스", 2013, 8.3),
                new Movie("라라랜드", "뮤지컬", 2016, 8.1)
        );

        double answer1 = movies.stream()
                .filter(movie->movie.getGenre().equals("SF"))
                .mapToDouble(movie->movie.getRating())
                .average()
                .orElse(0.0);
        System.out.println("장르가 SF인 영화의 평균 평점 : " + answer1);

        List<String>answer2 = movies.stream()
                .filter(movie->movie.getReleaseYear() >= 2010)
                .sorted((m1, m2) -> Double.compare(m2.getRating(),m1.getRating()))
                .map(movie->movie.getTitle())
                .toList();
        System.out.println("2010년 이후 개봉 영화 (평점 내림차순): "+answer2);

        List<String>answer3 = movies.stream()
                .sorted((m1,m2)->Integer.compare(m2.getReleaseYear(),m1.getReleaseYear()))
                .limit(3)
                .map(movie->movie.getTitle())
                .toList();
        System.out.println("가장 최근에 개봉된 영화 3개 : " + answer3);

        Map<String,Long>answer4 = movies.stream()
                .collect(
                        Collectors.groupingBy(
                             movie->movie.getGenre(),
                                Collectors.counting()
                        )
                );
        System.out.println("각 장르별 영화 수 : "+answer4);

        // 5. 평점이 8.5 이상인 영화들의 장르를 중복 없이 알파벳 순으로 정렬하여 반환하기
        // 결과 : [SF, 드라마, 액션]
        List<String>answer5 = movies.stream()
                .filter(movie->movie.getRating() >= 8.5)
                .map(Movie::getGenre)
                .distinct()
                .sorted()
                .toList();
        System.out.println("평점 8.5이상인 장르 (알파벳 순) : "+answer5);
    }
}
