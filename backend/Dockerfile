FROM openjdk:17-jdk-slim

# 作業ディレクトリ作成
WORKDIR /app

# ホストからのファイルをコピー（build.gradle等のビルド用に）
COPY build.gradle settings.gradle gradlew /app/
COPY gradle /app/gradle

# 依存だけ先にダウンロードしてキャッシュ効かせる
RUN ./gradlew build --no-daemon || return 0

# ソースコードを追加
COPY . /app

# DevTools を有効にして Spring Boot 起動
CMD ["./gradlew", "bootRun", "--no-daemon"]
