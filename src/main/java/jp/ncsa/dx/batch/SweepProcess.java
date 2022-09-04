package jp.ncsa.dx.batch;

import jp.ncsa.dx.type.BatchExecuteResultTypes;

public class SweepProcess {

	/**
	 * 保存期間を超えてデータをスイープする。
	 * 
	 * @param status ステータス
	 * @return 実行ステータス
	 */
	public BatchExecuteResultTypes execute(String status) {

		// 開始ログ　※本来はログファイルに出力する。
		System.out.println("スイープ処理を開始します。");
		// 実行結果
		BatchExecuteResultTypes executeResult = null;

		if ((Integer.valueOf(status)) == BatchExecuteResultTypes.SUCCESS.getCode()) {
			executeResult = BatchExecuteResultTypes.SUCCESS;
			System.out.println("正常終了する");
		} else if ((Integer.valueOf(status)) == BatchExecuteResultTypes.ERROR.getCode()) {
			executeResult = BatchExecuteResultTypes.ERROR;
			System.out.println("異常終了する");
		} else if ((Integer.valueOf(status)) == BatchExecuteResultTypes.WARN.getCode()) {
			executeResult = BatchExecuteResultTypes.WARN;
			System.out.println("警告終了する");
		} else {
			throw new RuntimeException("想定外の引数が指定されました");
		}
		
		// 終了ログ　※本来はログファイルに出力する。
		System.out.println("スイープ処理を終了します。実行結果＝" + executeResult);
		
		return executeResult;
	}

}
