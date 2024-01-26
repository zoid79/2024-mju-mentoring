package com.mju.mentoring.board.domain;

import com.mju.mentoring.exam.board.domain.Board;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static com.mju.mentoring.board.fixture.BoardFixture.게시글_생성;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@SuppressWarnings("NonAsciiCharacters")
class BoardDescriptionTest {

    @Test
    void 게시글을_업데이트한다() {
        // given
        String newTitle = "newTitle";
        String newContent = "newContent";
        Board board = 게시글_생성();

        // when
        board.update(newTitle, newContent);

        // then
        assertSoftly(softly -> {
            softly.assertThat(board.getBoardDescription().getTitle()).isEqualTo(newTitle);
            softly.assertThat(board.getBoardDescription().getContent()).isEqualTo(newContent);
        });
    }
}
