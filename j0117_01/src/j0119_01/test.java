package j0119_01;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

@DisplayName("로또 번호 범위 테스트")
public class test {
	@Test
	public void main() {
		// given(준비): 어떠한 데이터가 준비되었을 때
		final LottoNumberGenerator lottoNumberGenerator = new LottoNumberGenerator();
		final int price = 1000;
		
		// when(실행): 어떠한 함수를 실행하면
		final List<Integer> lotto = lottoNumberGenerator.generate(price);
		
		// then(검증): 어떠한 결과가 나와야 한다.
		Assertions.assertTrue(lotto.stream().allMatch(v -> v >= 1 && v <= 45), "로또 번호가 1~45 범위를 벗어났습니다: " + lotto);
	}

}
