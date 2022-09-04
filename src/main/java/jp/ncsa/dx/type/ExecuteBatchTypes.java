package jp.ncsa.dx.type;

/**
 * 
 * 実行バッチ管理クラス
 *
 */
public enum ExecuteBatchTypes {
	SWEEP_PROCESS(2);

	// 引数の定義数
	private int argsQty;

	/**
	 * 引数の定義数取得
	 * 
	 * @return 引数の定義数取得
	 */
	public int getArgsQty() {
		return argsQty;
	}

	private ExecuteBatchTypes(int argsQty) {
		this.argsQty = argsQty;

	}

}
