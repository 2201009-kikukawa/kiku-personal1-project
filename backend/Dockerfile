# ベースイメージ（JDK入りの軽量イメージ）
FROM openjdk:17-jdk-slim

# 環境変数（必要なら設定）
ENV JAVA_OPTS=""

# 作業ディレクトリの作成と移動
WORKDIR /app

# JARファイルをコンテナにコピー
COPY build/libs/*.jar app.jar

# ポート8080を開放
EXPOSE 8080

# アプリの起動コマンド
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
