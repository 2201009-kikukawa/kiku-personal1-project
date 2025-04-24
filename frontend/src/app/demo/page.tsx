"use client"; // クライアントコンポーネントとして明示する

import { useEffect, useState } from "react";
import axios from "axios";

export default function DemoPage() {
  const [data, setData] = useState<any>(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/api/hello") // ← ここは実際のエンドポイントに置き換えてね
      .then((res) => setData(res.data))
      .catch((err) => console.error(err));
  }, []);

  return (
    <div>
      <h1>デモページver2</h1>
      <pre>{JSON.stringify(data, null, 2)}</pre>
    </div>
  );
}
