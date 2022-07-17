AndroidX Lifecycle 練習。使用Configure Build Variants 來區分不一樣的實作方式。

Case1: 
- Lifecycle Owner: 為Activity且繼承AppCompatActivity。（AppCompatActivity為ComponentActivity的子類，且ComponentActivity有實作LifecycleOwner介面。）
- Lifecycle Observer: 建立一個MyObserver class並且實作DefaultLifecycleObserver介面

Case2:
- Lifecycle Owner: 自定義Lifecycle Owner，建立class並實作LifecycleOwner，最後建立LifecycleRegistry來控制Owner狀態。
- Lifecycle Observer: 建立一個MyObserver class並且實作DefaultLifecycleObserver介面
