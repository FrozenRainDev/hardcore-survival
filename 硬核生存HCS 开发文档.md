# 更新日志

1.21 设置重锤对Boss单次伤害有上限

- 属性加点
- 减少机械重复，不追求流程长度，而是质量

模组新名字：
survival trek 生存苦旅

废案（？）：
hardcore survival: trek
hardcore survival: redefinition
hardcore survival: odyssey
hardcore survival: expedition

survival trek~~/trudge/tramp~~
[Trek Survival - Minecraft Modpacks - CurseForge](https://www.curseforge.com/minecraft/modpacks/trek-survival)
survival trek: redefinition
survival trek: epic

survival expedition
~~[Survivalcore (See Description) - Minecraft Modpacks - CurseForge](https://www.curseforge.com/minecraft/modpacks/survivalcore)~~

~~harder than survival
better than hardcore
survival is too easy~~

## Beta 0.19

直接模仿僵毁，隐藏状态栏
技能面板【生命 防御 暴击etc】

- 分部位血量（不显示总血量）+医疗
- 体重和营养系统
- 代入感增强 不显示数值 属性点（自我感知）
	- 不告诉精确数值！只留下文字表述
	- 最大生命上限减少会在图标中以黑色标出
	- 血量会有进度条，身体各个部位的（所以需要先医疗更新）
	- 各个图标的进度条更细致，不按像素划分
	- 经验条删掉（占空间） 数值右下角显示 Lv.11 114/514
	- 自动关闭强制显示unicode字体
- 1.21可以设置玩家的跳跃高度→debuff会削弱跳跃高度
- 对于一些需要重复计算的指数函数、三角函数，进行哈希表缓存，时间换空间优化（原版API内自带三角函数HashTable）

nbt不携带tag的掉落物(如方块被破坏后的掉落物)在被漏斗漏入箱子/陷阱箱后会添加空的tag标签(tag:{})，这会导致玩家一直打开箱子时新的掉落物无法叠加进添加tag标签物品中

> 由于后面还会加食物耐久（比如炒菜和煲汤不会一次性吃完），所以食物的新鲜度不用耐久条表示

前期的迷之炖菜会怎么样？
击晕附魔
矿物合成附魔瓶

感觉攻击力增加的梯度太慢了，后面可以考虑技能点和强化下界合金武器来增加后期攻击力
或者加新附魔，比如快速治疗，疼痛缓解等等，加快回血速度
或者加上穿火焰保护的盔甲被火烧能疼痛降低 去下界炸残骸 随便被火烧到了就是极度疼痛，*好几分钟才能缓解*

%%猛男生存魔改内容：
1，玩家准星靠近动物如羊等 会变成兔子 很难获取羊毛，牛奶桶，鸡蛋等
2，水有水压，并且长时间呆在水里会有负面效果
3，水下刷怪离谱
4，受到攻击身上物品会随机掉落
5，玩家死亡会生成速度极其快的僵尸“Grave Zombie”墓穴僵尸 并且带有皮革帽子 并且到处好像都有刷
6，随时可能会有渡劫雷 快的离谱 雷实体极其多
7，原木只能分解出两个木板
8，晚上生成装备及其好 伤害极其高的离谱怪物
9，玩家附带挖掘疲劳 史蒂夫手挖掘机失效
10，挖石头可能不掉圆石 并且有可能生成虫
11，满饱食度不恢复生命值 史蒂夫干细胞失效
12，抛射物旋转强化 黄金回旋
13，苦力怕瞬间爆炸 远程才能安全解决
14，矿石不一定百分百掉落  钻石掉落严重削弱
15，从高处降落可能会有虚弱，反胃，失明，缓慢等负面效果
16，开船附带饥饿5 船上不安全 推测矿车也一样
17，女巫投掷物加强 范围加强
18，跳跃有概率随机掉落物品
19，岩浆加强 火焰跟着实体灼烧 燃烧中的实体纵火 烧伤不掉落物品 手持岩浆玩家燃烧 岩浆桶附近也会燃烧
20，钓鱼削弱 掉到的鱼类会化为腐肉 推测肉类食物变成腐肉
21，盾牌弱化成纸糊盾牌 耐久消耗特别快
22，带有虫的石头上可能会有唤魔者的夹子 吞物品
23，虫的感应范围加大 
24，根据玩家的准星 水自动的飞了出来
25，地狱门可能自动关闭 固然随机开门（推测）
26，使用生的食物如生鳕鱼等 会获得中毒、反胃、饥饿等负面效果

这是套了第几次了？

真·暴毙生存

此评论不断完善中 欢迎大家指出问题
%%


近战武器攻击力强化不够（参考MITE跳劈死僵尸）

或者添加技能（僵毁）

洞穴恐怖音效【比狼好BTW极限生存挑战 Day 13~16-哔哩哔哩】【视频标记点 06:41】 https://b23.tv/z8OfAK0
06：38
07：21惊吓音效

骨棒
吃生肉掉san

- 那个，地上直接捡石子，然后砸其实我觉得挺好的
- 暴击率附魔 怪物要害
- 我发现这个体力掉的数量和你一刀看下去打到的怪的数量成正比啊
- 爆炸耳鸣音效
- 新背景图？
- 石头捡起；草不掉木棍，改为树叶掉&树叶底下刷新
- 食物中毒会产生呕吐的粒子效果
- 腊肉，把晾在晾干架上面的肉品，用盐对着右键。等时间长一点就成为腌肉
- 怪物强度地表<洞穴<地下世界<下界 始终保持危险的感觉
- 背包容量限制
- 月相：夜晚亮度会受其影响，新月漆黑一片（查理：lol） [参考模组 该模组也有月相决定夜晚亮度](https://www.mcmod.cn/class/1667.html)
- 地狱猪人一直有仇恨
- boss掉落物 搓背包 扩容；削容量
- 松针茶 雪鞋
- 熊 被食物吸引
- 夜钓线
- 小猎物 蛆虫
- 陷阱
- 草原刷兔子
- 点燃物
- 火犁？
- x后怪物强化（参考btw加难度模组）
- 蜘蛛吐丝有投掷物动画
- 可以中毒而死
- 蜘蛛吐丝有投掷物动画

模组昏暗环境下的音效改成洞穴和下界环境杂音

食物有耐久村民不能捡起来繁殖，是故意的还是不小心的



## Beta 0.18.1

凋零头骨碎片
末影龙不掉装备的bug、凋零真的抗炸？
现在再试试恶魂火球强度


- 加大食物中毒惩罚
- 流血机制进一步优化 中度扣1点改为扣半点？ 0~1废除！
- ==修复了破坏方块时可能破坏到一半复原的bug==
- 现在打制石块改为磨制了，100%成功，并降低了岩石和燧石的爆率
- 那更新1.20版本之后 饰纹陶罐也应该加个腌咸菜的作用吧
  碗+纯净水瓶+生姜→姜汤
- 盐渍食物？
- 钓鱼机制改革
	- 开阔水域才能钓上鱼
	- 咬钩时间集中在日出日落
	- 鱼竿以前不能空甩，需要诱饵→调整为空甩钓不上鱼
- 添加了生物棕熊，在温带森林和针叶林中会生成。与之对视或接近其幼崽都会将其激怒（北极熊同理）。
- 降低了极度惊恐下射箭和投掷的命中率
- 食物变得更难获取（僵尸会吃肉，且如果够不到玩家会尝试杀死动物）
- 添加了凋零骷髅头骨碎片作为凋零骷髅的掉落物，用于合成凋零骷髅头颅，使其更容易获得
- 添加了筛砂砾用的筛子
- ~==提高了凋零骷髅的血量，加快了其移动速度==
- 金西瓜保质期不是无限的bug
- 竹子挖掘速度 get speed sword?
- 墓碑
- 草方块随机长草？日照+温度影响
- 增强了与苹果核模组的兼容性
- 水果干
- 添加了咖啡，能回理智
- 添加了短剑
- 后续希望改革一下，晒太阳越久烈日buff越高
- 把铁皮时间延长，但是要用铁块酿造，而且会掉san值
- 烈焰人近战攻击
- 改MC主线成就
- ArmorMaterialsMixin代码迟早要优化
- 爆砂砾、草等的随机数改成由时间决定的伪随机数
- 背包格子限制&物品堆叠数
- 代码优化：修改掉落物品可以参考`HCTLootTableModifier`

<!--复活血量不满的bug修不好，干脆复活残血 ==金胡萝卜变质的bug==-->


## Beta 0.18.0


[轻松解决png图片警告 iccp: known incorrect sRGB profile](https://zhuanlan.zhihu.com/p/659433374)
- 洞穴怪物
- ==[支持部分config，参考，很容易实现的](https://github.com/WolfieWaffle/Hardcore-Torches-Fabric/blob/main/src/main/java/com/github/wolfiewaffle/hardcore_torches/loot/TorchLootFunction.java)==
	- 建议参考`OnlineOptionsScreen.class`，做可视化设置界面，且只有服主能够操控
- 沙砾保底掉率 如连挖6个没掉必出1

## Beta 0.17.2

弓充当火把枪用 火把枪射到无法附着的方块上（如水、栅栏）自行掉落物品

- 可投掷的长矛
- check: 动物掉的骨头
- 重锤对boss伤害有上限
- debug：书会加攻击距离？
- 水袋 参考打破一切
- bug：火把能点燃水中
- 受伤时的闪红特效改为集中在视野边缘
- 掉落物消失时长从6000ticks延长至24000ticks
- 改进熄灭篝火的材质，转为立体，并将篝火类的物品在创造模式物品栏中的排序靠后
- ==石块的打制（左键，立刻，有概率掉锋利石块）和磨制（右键，需时间，100%掉锋利石块）==
- Shift右键拿起正在烤制的食物（会重置烤制进度）
- 篝火烤肉较慢，且一个篝火最多只能放两块肉 %%重做铲子灭火%% 篝火架树枝模型
- ==燃尽、阴燃的篝火添加掉落物：掉落木炭渣，可以直接烧，4个合成一个木炭==
- 添加木炭渣和煤粉：能燃烧更长的时间
- 精准采集 阴燃的篝火 和 燃尽的篝火
- 火把可以作为燃料

- [ ] debug2：
	- [x] 燃尽的篝火仍然处于LIT，所以还会继续产生热量（或者判断时遗漏掉unlit的情况）
	- [ ] (Minecraft) Profiler tick ended before path was fully popped (remainder: 'root.gameRenderer'). Mismatched push/pop? ==栈的出入问题==
	- [ ] [21:39:09] [Thread-9/ERROR] (hcs) UpdateHelper: Connect timed out GET(modrinth)

- debug：热水袋服务器运行无法冷却
- debug：晒肉架物品拾取与渲染不同步
- 移除盔甲韧性，重置盔甲机制（伤害=max(1,伤害-护甲值)）
- 移除攻击间隔 恐惧减伤害就好了 缩减斧头距离和攻击力、体力
- 篝火烤肉只能架起来烤
- 支持1.20.1
- 优化火把掉落（破坏附着方块时）
- 添加扇子，右键可以降温（但效果有限）
- 吃撑优化
- 设置：**强制使用Unicode字体**
- 修复末影水晶传送的bug
- 添加火种罐（火折子）
- 熔炉也需要生火点燃
- 将物品信息栏的盔甲值显示精度由小数点后两位改为后一位
上次说错版本了是Beta0.16.1,这次也是。  没错，我又来了。
bug石锤
1.黑暗中的怪物来临时不会出现鬼脸贴图。"且会有较为惊悚的特效"
2.趴下钻进一格高的洞时即使有照明仍然会被黑暗吞没。不用头部检测的后果
3.多个正在播放的唱片机会叠加改变san值。(建议改成减缓或不增加san)
4.咸水瓶能被熔炉或烟熏炉烧制,但唯独不能用营火烧制。忘加配方?
5.所有id为potion的物品都能被烧成纯净水。想不到吧我会翻recipes
6.受伤闪红时秒切创造会保留红色滤镜。(其他的也是)
- 属性成长面板？像rl craft或者未转变者那样
  能不能给经验值加点作用呢？升级之后增加体力条
- 砸矿石得经验

建议？
1.大削雪屋。(可以改成永远不刷地下室)
2.削弱弓弩耐久,将掠夺者的弩添加unbreakable标签。同为木头为主体的为什么你这么耐久
3.手持药水箭能扎自己,扣除一定HP(建议1~2HP)后获得药水箭的效果。药水箭太冷门了加强下TA怎么了
4.削弱沉船宝库和藏宝箱里的物资,让藏宝箱不固定刷新在区块坐标(9,9)的位置,并让藏宝图标注的“X”不准。我玩原版就是通过航海流开局第2天铁套的
- [==新官网==](https://blog.csdn.net/weixin_46530492/article/details/130797998)
- ==教程+人工翻译==
- 水里逆流走不动 
- 熔炉燃烧需要点燃
- 不能脚底垫方块（后期解锁）那掉入1×1的深坑怎么办？可以抵墙面爬上去吗？！
- 徒手打无击退
- 僵尸啥动物的肉不掉 播放打嗝音效 打嗝音效
- 特感恶魂&猪人
- 苦力怕腺体→炼药：抗爆药水
- 黑暗笼罩状态下视野拉长
- 僵尸咬伤机制 抗菌剂×青霉素的提取✓
- 代入感增强：极度疼痛音效
- 石块和木棍在地上捡起
- debug：`11:02:33 Render thread/ERROR (Minecraft) Profiler tick ended before path was fully popped (remainder: 'root.gameRenderer'). Mismatched push/pop?`
- 将更多的`Math.random()`改为`world.getRandom().nextFloat()`
- 实装动态光源
- 语言翻译
- 添加筛网
- 火把不能够破坏坠落的方块
- 添加了**蓝冰套装**和**盔甲内衬**
- 纤维绳需要晾干和编织（藤蔓？）
- 加大夜间在暗处的理智下降速率，减缓在明处的理智下降速率
- 添加花环（代替花）
- ==玩家不能跳起来垫方块==
- ==加大极端温度惩罚==
- 延长火把攻击距离；用火把打怪有概率引燃怪物（有提示），但掉耐久
- ==debug：水瓶的“无效果”突然变成了三个乱码全角字符（切换英文后“No Effects”变成 9 个乱码半角字符），退出存档后重进仍然有这个 bug，退出游戏后重进正常。目前触发方法未知。==
- debug：==三叉戟打怪判定空手==

能不能直接给盔甲加一个保底护甲？就是比如铜甲在受到2点伤害的时候只掉落耐久；但高版本的护甲和攻击间隔是不好用，很影响手感；而且金属铠甲会被裸装怪物一下破防，感觉挺奇怪的，而且怪物拿的都是燧石剑，可以破金属铠甲感觉很抽象

mite可以参考的东西挺多的，比如物品的耐久度交换，方块硬度，还有盔甲直接就是伤害减护甲值等于受到伤害
==然后无论你的护甲值有多少都有概率受到半滴血伤害，防止后期完全无敌==
==现在懂了，mite的盔甲机制和泰拉差不多，泰拉是 `受到的伤害=伤害-盔甲*不同难度的因数`，而且至少造成1点伤害==

等级提升可以增加玩家1%体力条和挖掘速度之类的提升



unfixed bug:
拿起热水袋的动画比正常的物品快。盛开的杜鹃树叶能被秒橹。
石头/燧石的投掷精度过高。鸡骑士会主动杀死鸡。
(也许是bug?)5号唱片有一段音乐舒缓但仍会掉san。
取出晾干架上的物品时物品会掉在方块角落而非方块中心。
副手拿盾时吃食物会中断体力恢复。
用带精准采集的工具挖沙砾仍有可能爆燧石或粗铜粉。
panic≥恐慌时使用望远镜会渲染成黑屏。僵尸的逆天挖方块Al,包括但不限于:(穿墙挖)
僵尸能挖掉自己脚部x轴+2格的方块位置。(前者优先)
僵尸在挖方块A时替换成方块B，
方块B的挖掘速度和方块A保持一致，且会不受挖掘等级限制地掉落。

## Beta 0.17.2

- [ ] 僵尸AI 遇到replaceableplant会无法挖掘
      ![image.png](https://itg.singhinder.com?url=https://gist.githubusercontent.com/FrozenRainDev/ddd8626676d4c8115ab963c91fe2be3b/raw/image.png)
- [ ] 阴燃的篝火亮度为0问题（猜测是state.lit=\=false导致）
- [ ] 晾干架挂肉问题 可能是联机时S2C不及时，没有通知到每个玩家
- [ ] 动物受到爆炸伤害不会跑（苦力怕）
- [ ] 修改zh_cn语言表述 比较人机的部分
- [ ] 服务器热水袋问题 进度条 trend 无法交互
- [ ] 疑似 服务器问题 非管理员不能交互方块
- [ ] 雪地跑步照样失温
- [ ] 雪屋不暖和 仍然有寒风debuff 疑似冰透光

## Beta 0.17.1


- Supported MC 1.20.1
- Fixed known bugs in Animal Panic
- Optimized the cow kicking mechanism
- Fixed a bug where the status bar icon was not centered after dismounting a horse.
- Fixed a bug where torches could be used to light water-logged campfires.
- Fixed a bug that extinguished campfires can cause damage to non-player entities.
- Fixed known bugs with server food corruption

---

- 支持MC 1.20.1
- 修复了动物恐慌的已知bug
- 优化了牛踢人的机制
- 修复了下马后状态栏图标不居中的bug
- 修复了能用火把点燃浸水篝火的bug
- 修复了燃尽的篝火对非玩家生物造成伤害的bug
- 修复了服务器食物腐败的已知bug


测试
- [x] isReplaceableBlock
	- [x] campfire isReplaceableBlock
	- [x] knifeitem postMine isReplaceablePlant
- [x] 马等坐骑的生命显示问题（重启游戏刚开始进入世界时）ing attacked== 不生效
- [x] BurntCampfireBlock super() luminance
- [x] ALL ingame hud 下马后状态HUD不会恢复居中
- [x] 牛AI再次出现问题 将CowKickRevengeGoal优先级设为1（原0）即可解决
      ~~猜测屎山会一直尝试优先执行~~
- [x] 动物永久恐慌不生效
- [x] zombie break block goal interrupted after being attacked
- [x] add 牛被打时不会立刻踢人
- [x] icebox oh no低硬度发12级光 drying\_rack
- [x] ALL torches 墙上的未点燃火把发14级光
- [x] all recipes including ExtractWaterFromBambooRecipe
- [x] loot helper delSpecificLoot state.getMaterial() == Material.NETHER_WOOD
- [x] updateHeldItems
- [x] ingamehud::renderHeldItemTooltip when insane
- [x] 冷水袋对岩浆失效是否是故意的 是
- [x] 水中点燃火把bug
- [x] RUN SERVER getHallucinationEntityForPlayer
- [x] 服务器食物迅速腐败问题 拿在手上刷新
- [x] 燃尽的篝火对非玩家生物有伤害效果（但似乎不掉血）
- [x] git add branch & commit

Material可用BlockSound和boolean property代替

debug: ingame hud
不居中 未隐藏原版状态栏

[Cannot add LIT BlockState property as it tries to look for it in air on startup](https://www.reddit.com/r/fabricmc/comments/194tglf/cannot_add_lit_blockstate_property_as_it_tries_to/)
[解决springboot大片报红，提示：Add library xxx to classpath的问题\_add library to classpath-CSDN博客](https://blog.csdn.net/jiaohuizhuang6019/article/details/130054790) 

## Beta 0.17.0

- 火源和照明更新
	- 火把
		- 物品：粗制火把、燃烧中的粗制火把
		- 火把有燃烧时限
			- 玩家制造的火把为粗制的火把（模组添加），会熄灭，烧没了作废，不能重新点燃
			- 遗迹中生成的火把是原版的火把，不会熄灭
		- 火把熄灭
			- 当玩家浸入水中后，背包内的火把会熄灭
			- 火把露天放置时，淋雨时会熄灭
			- 合成出来的火把是熄灭的，需要火弓或打火石引燃
		- 将红石火把的亮度降低为4
		- 爆炸、水冲等会直接摧毁火把而不会掉落
		- 永亮火把用地狱岩合成
	- 添加萤石火把
	- 篝火
		- 刚做出来是熄灭的，需要工具引燃
		- 火弓重做（贴图、机制、配方）
		- 篝火可以用火把点燃
		- 篝火不能反重力
		- 生火掉耐力、饥饿值和水分
		- 相邻的篝火可以点燃
		- 添加火犁（引火较火弓更慢）
		- 燃烧需要燃料（参考btw）
			- 亮度、火焰大小受燃料多少影响
			- 燃料耗尽后呈余烬状态，不继续添加燃料会碳化并失效
			- 填充燃料：使用燃料右键/扔向篝火
			- 灵魂篝火不受影响
		- 精准采集的篝火在背包中有耐久
		- 新篝火：阴燃的篝火、燃尽的篝火
		- 篝火会引燃紧挨着的可燃物
- 怪物方面
	- 再次调整了火球、小僵尸和骷髅射箭的伤害
	- 提高了食物中毒的概率，并加大了其惩罚
	- 持工具敌怪攻击距离延长
- 优化
	- 用木铲子挖沙砾出铜粒的概率提高了2%
	- 降低了鸡毛的掉落频率
	- 添加强心针
	- 马和驴死亡掉的小肉改为牛排
- 其他
	- 废除了最大生命上限受经验等级制约的设定
	- 铜镐不能挖金矿石的bug优化
	- 游戏亮度锁定为昏暗
	- 雨天抬头补充水分
	- 篝火一次只能烤制一块肉
	
<br/>

---

%%
- 阴燃的篝火：炭烤速度为明火烧烤速度的$\frac{1}{2}$→注册篝火实体：阴燃的篝火、燃尽的篝火
%%

- [x] 阴燃的篝火、燃尽的篝火
	- 破坏方块的手段、掉落物品
	- 降低阴燃的篝火的烫伤伤害
	- 为阴燃的篝火添加粒子效果
	- 燃尽的篝火不应该造成烫伤
	- 改进材质（尤其是火星，可以加入动态`.mcmeta`，位置不变，但亮度忽明忽暗）
- [x] 转化为阴燃的篝火时，保留挂在上面的物品
- [x] 燃尽的篝火不能点燃，哪怕一个tick（添加到函数`canBeLit`条件中）
- [x] `invalid for ticking`问题（见记录）
- [x] 篝火燃烧进度——火焰大小实现
	- [x] 从API（JSON）层面，而不是代码层面实现
	      通过调整`element`的`from` `to`的y轴（第二个元素，原`[,1,] [,17,]`，高16px）实现火焰材质的缩放
	      %%看来只能对材质进行修改了，传统的移位貌似不行，会导致材质渲染异常%%
- [x] 修改篝火掉落物（木棍+灰烬）
- [x] debug：阴燃的篝火无nbt标签 burning time
- [ ] <font color="#ff0000">debug：精准采集的镐子可以刷新燃烧进度→设定：篝火在背包中也有耐久！</font>
- [x] debug：燃烧时泼水的情况
- [ ] 篝火在背包中有耐久
	- [ ] mixin CampfireItem
	- [ ] 引用`RotHelper`
	- [ ] 摆出来的`BlockState`问题
	- [ ] 似乎已解决破坏篝火方块的掉落问题：直接按燃烧比例返还木炭、灰烬和木屑

%%
```java

    @Inject(method = "onStateReplaced", at = @At("HEAD"), cancellable = true)
    public void onStateReplaced(@NotNull BlockState state, World world, BlockPos pos, BlockState newState, boolean moved, CallbackInfo ci) {
        if (state.isOf(Reg.SMOLDERING_CAMPFIRE_BLOCK)) {
            this.
            super.onStateReplaced(state, world, pos, newState, moved);
            ci.cancel();
        }
    }

```
%%

---

- [x] debug：
	- [x] 检查火把燃烧和耐久度变化 both 放置 and 背包 and 放置和背包的转换
	- [x] 火把模型不透明！（排查：java类代码问题？！/JSON）**BlockRenderLayerMap.INSTANCE.putBlock**
	- [x] 火把无法引燃
	- [x] 添加：降水熄灭火把
	- [x] 当玩家沉入水中时，所有点燃的火把都会熄灭
	- [x] 火把有燃烧时限测试（灯笼和南瓜灯没有）
	- [x] 用岩浆引燃手中的火把会导致手中的火把烧焦 ×岩浆不能引燃手中的火把 重复引燃3次
	- [x] 火把熄灭还木棍可以刷木棍
	- [x] 直接创建新的方块，而不是用blockProperty？
		- [x] 先尝试自定义property
	- [x] 火把燃烧时限（制作出后有耐久）
		- [x] 添加烧焦的火把（有概率回收木棍）
	- [x] 火把破坏后亮度不会刷新
	- [x] `点燃的粗制火把`不能点燃`点燃的粗制火把`
	- [x] 火把无掉落物 `loot tables` wall掉落原版火把 floor无（走投无路就直接规定掉空气，被破坏手动dropStack）
	- [x] 蜡烛之类的要能够点燃（删掉，蜡烛没有燃烧诶） [参考](https://github.com/WolfieWaffle/Hardcore-Torches-Fabric/blob/main/src/main/resources/data/hardcore_torches/tags/blocks/free_torch_light_blocks.json)
	- [x] 这个mod可以通过点燃火把把打火石的耐久变成负数？
	- [x] 火把可以导致升温
	- [x] 墙上的燃烧火把的火焰粒子效果仍然继承自父类，没有自定义
	- [x] 粗制火把的燃烧时间也有问题
	- [x] 不能点燃手持的粗制火把
	- [x] 添加熄灭的原版火把
	- [x] 燃烧的粗制火把不能秒破坏
	- [x] debug：熄灭的粗制火把会产生燃烧的粒子效果
	- [x] 优化：减少粗制火把的火焰粒子效果
	- [x] 点燃在墙上的粗制火把没有设置火把的朝向，再点燃一次就会变成在地上的粗制火把；**朝向问题**
	- [x] 合成配方替换
	- [x] `未点燃的火把`能点燃`未点燃的火把`
	- [x] `hcs:wall_burning_crude_torch}[facing=north] invalid for ticking` (solve: `override getTicker()`)
	- [x] 添加：爆炸破坏的火把不会掉落
	- [x] 打火石点燃火把应播放打火石的音效而非火焰弹的音效
	- [x] 掉落物函数重写
	- [x] ×删除[废弃的下界传送门](https://www.mcmod.cn/item/236470.html)的地狱岩（最后一点仁慈），以防进入下界前获得 可以改成头皮屑岩 还是不行%%？不删也可以？× × 地狱煤√ 8煤+1烈焰粉也能合成 - [ ] 中暑的特效有“夜视效果”- [ ] 燃烧的火把能够点燃蜡烛 注册 hashmap concurrent modification 是因为verticallyAttachable 的两个中的有一个没有注册Registry.register FabricBlockSettings.copyOf(Blocks.STONE) （成为余烬，除非在创造模式下，或铲子附魔精准采集）%%
	
> 教程优化
> 前期照明：南瓜灯、灯笼、探索获得的火把

> 报错`Cannot read block property LIT in minecraft: air`解决方法：`.luminance(state -> state.contains(LIT) && state.get(LIT) ? 12: 0)`→教训：访问BlockProperty时永远要预先检查

> 关于`block entity invalid for ticking`
> ```java
> extends BlockEntity/*注意一定要继承该父类*/ implements BlockEntityProvider
> ```

> 设置JVM内存 见gradle.properties；记得更新里面的mod property - ver
## Beta 0.16.1

- **修复了石块扔出后返还燧石的bug**
- 更改了锋利石片的材质
- 优化了流血机制

## Beta 0.16.0

- 原版Boss强化
  - 末影龙和凋零免疫爆炸伤害，且彼此之间不会被挑衅
  - 末影龙
    - 末影龙的冲撞伤害调整为原版的2倍
    - 末影龙不会悬停在柱子上
    - 延长了末影龙使用末影水晶的距离
    - 末影龙血量低于30%时会发动附近末影人群攻玩家（末影龙头上和末影人头上同时出现粒子效果）
    - 末影水晶每被挖掉一次，会激怒末影龙一次——尝试冲撞玩家
    - 当范围内没有末影水晶时，会给末影龙2级抗性提升、速度效果
    - 末地水晶必须用下界合金镐破坏（不能用TNT）
    - 末影龙可以通过龙息造成的伤害回等量的血
    - 末影龙发出的龙息球可以造成可观的爆炸伤害
    - 末影龙冲撞可以破盾
    - 破坏末影水晶会被雷劈
  - 凋零
    - 凋零能给玩家极度惊恐的debuff
    - 凋零会召唤凋零骷髅
    - 凋零二阶段防御明显增强
    - 凋零二阶段会冲撞玩家
  - Boss额外奖励：凋零奖励下界合金锭和钻石、末影龙奖励附魔金苹果，下界合金锭和钻石

- 细节优化
    - 灰烬具有一定的止血作用
    - 进一步调整了跑跳的体力消耗速率
    - 贴图优化
    - 动物受攻击后不是四处乱窜，而是有意识地逃离危险源
    - 进一步完善了食物中毒的机制
        - 喝水也可能食物中毒
        - 吃蜘蛛眼、食用仙人掌肉等会食物中毒
        - 除了腐肉和尸壳攻击，其余大部分饥饿效果被替换为食物中毒效果
    - 优化：从更高难度模式切换到休闲模式后，流血、骨折值会清零
    - 挤奶会被牛踢
    - 牛每天只能挤奶一次
    - 加大饮用生水感染寄生虫的概率
    - 给回程药水加了粒子效果
    - 给皮革护甲加了防牛踢的提示
	- 添加了无畏药水

<!--末影龙会瞬移，尤其是血量少时 末影龙长时间未受到伤害会尝试修复末影水晶（挑战模式） 凋零二阶段不会总是落地 抗性提升和保护附魔提高的盔甲值会被显示 不科学 再把其他的数值对齐？影怪会尝试挖掘周围的火把，使玩家陷入黑暗。
影怪于下界被杀死会掉落噩梦粘液。晾干后得到纯净粘液，吃了回33san，可用于制作末影之眼（珍珠+烈焰粉+纯净） 雪屋村民？- ×腹泻改为加速脱水？- ×饥饿改成食物中毒？仅限腐肉（方便完成成就 狂乱的鸡尾酒）、尸壳 优化动物恐慌互相传染导致卡服 算法时间复杂度$O(n^n)$TAT - - 钻石&经验之瓶？无畏？背包？移速？- 附魔书&下界合金？最大耐力提升？bug高处落水是否骨折？加大下界合金甲的盔甲韧性？ 凋零（其实强度已经挺大的了，尤其是没有耐力的情况下）--><!--出个打Boss的视频？下界合金 保护4 附魔金苹果 打龙-->



## Beta 0.15.7

- 优化了药水效果
	- 铁皮药水 铁皮buff加1.2点护甲值（强化后加1.6点）
	- 镇痛buff颜色改灰色
	- 回程药水现在不能跨界传送了
	- 伤害吸收也会缓冲流血和疼痛
- 修复了变质牛奶合成铁桶能刷物品的bug
- 修改了护甲机制
	- 修改了木甲的盔甲值分布
	- 有些羊毛和皮革装备会提供小于1大于0的盔甲值，而不是原先的0
	- 盔甲值和生命值数值显示对齐优化（基于禁用强制Unicode字体显示的情况）
	- 修复了非要穿护甲才显示铁皮药水加的防御数值的bug
	- 修复了护甲值随盔甲耐久降低而降低但不在物品说明信息上显示的bug
- 改进了生物的AI
  - 增加了僵尸对玩家的仇恨（相对于动物而言）
  - 添加了蜘蛛低血量时逃跑的特性（借鉴自MITE）
  - 添加了动物之间传递恐慌的特性
  - 添加了牛会以踢踹的方式反击的特性，但穿上皮革套装则不会（借鉴自BTW）
  - 修复了蜘蛛隔盾防毒的bug，并优化了蜘蛛的吐丝AI
- 添加了食物中毒的debuff，食用生肉或变质食物有概率获得，会导致玩家吃不下东西
- 细节优化
  - 再次修改了挖掘甘蔗的速度
  - 修复了喝药水不补水分的bug
  - 修复了回程药水传送成功后立刻走动还会显示传送失败的bug
  - 修复了传送有时候不掉水分的bug
  - 修复了吃一些食物（如野菜）可能补到一定程度饱食度一直卡在95%的bug
  - 取消中度疼痛视野间歇性发黑
  - 物品栏的攻击距离加成显示改到`放在主手时：`文字后
  - 修复了承受伤害后出现的闪红特效在玩家举盾免伤时仍然存在的bug
- 休闲模式下无疼痛debuff仍存在一些削弱效果的bug→休闲模式下不涨疼痛值
- 降低了徒手攻击导致的伤害数值

<details><summary>发展路线</summary>
> 感谢岷叔和米神的支持[给心心]
> 问题解答：
>
> 1. 钻石甲超模了？
>
> - 盔甲机制重写了，导致钻石甲比原版强很多。这是为后期添加的高强度boss及怪物做铺垫的。
> - 可以增加获取钻石器具的难度，需要更多材料，参考BTW
>
> 2. 药水的问题
> 	后面会加入进入下界前加必须完成的几
> 	个新流程[doge]（科技树、新维度、Boss战），所以模组后期版本能炼药已经是大后期的事情了，适当的正反馈是可以接受的
> 	关于两种药水：
>
> - 水肺抵消深处缺氧是刻意设计的
> - 回程药水不太想削弱，或许会考虑提高炼药成本和添加副作用（比如掉san）？
>
> 3. 村民交易也太强了！
> 	这个要改改，但要放后面
>
> 4. 后期玩法走科技线还是魔法线？冒险方面给下界加前置任务，科技方面更改合成方式，不矛盾
> 	科技模组玩的不多，暂时没灵感，先走成类似泰拉的PVE的魔法线吧，后面再考虑加科技（二者如果能处理好并不冲突，参考饥荒）
>
> 个人观点，不光要追求真实，还要有超越现实的内容，这才是游戏的精髓之一。最重要的是有正反馈和难度曲线平缓，这需要反复打磨。
>
> 请大家多多理解，作者时间有限，还要兼顾大学学业，只能慢慢来了[doge]
</details>
<!--~热水袋合成必须要特殊配方吗？不行，会吞瓶子！还能用药水合成 ×力量2药水延长变回力量1？-->




## Beta 0.15.6

主要内容：

- 修复了僵尸猪灵仇恨不会重置、透视激怒的bug，并延长了与僵尸猪灵对视激怒所需的时间
- 添加了治疗药膏和蝙蝠翅膀
- 进一步降低了骷髅箭矢的攻击力
- 添加了止痛药水（柳树皮+粗制的药水，100%镇痛）

其他内容：

- 新的游戏视角滤镜特效
    - 受伤后视野闪红的特效
    - 高度恐慌状态下视野边缘变黑的特效
    - 严重饥饿、口渴或疼痛时视野会间歇性发黑的特效
    - 现在处于漆黑恐惧中屏幕失明特效更为明显
- 金西瓜现在不会变质，还能吃
- 现在部分僵尸会主动躲避阳光
- 盔甲值也会受盔甲受耐久影响，当护甲耐久低于50%时会降低盔甲值，且数值可以为小数
- 修复了甘蔗用剑砍不了的bug
- 修复了背包满时喝水后扔出多个水瓶的bug
- 减慢了疾跑的耐力消耗速率
- 饱食度或水分小于60%削弱回耐力的速度改为小于50%
- 下雨加速作物生长的新特性
- 回程药水需要原地不动5秒后生效，移动或者被攻击就会取消传送；传送会消耗30%的饱食度、水分、理智，并造成5点伤害
- 修复了耕地耕到体力百分之0的时候还可以继续耕地的bug
- 修复了疼得睡不着时在下界和末地点床可以设置重生点的bug

<!--（原数据类型不改，imgamehud改数据源?Armor加入StatusManager）-->



## Beta 0.15.5

重大bug修复：

- 副手持方块时攻击可能打不中的bug（尽管在触及范围内）
- 晾晒出的皮革仍然会无法堆叠
- 修复了咸水瓶合成空玻璃瓶能刷瓶子的bug

优化调整：

- San值过低切创造/旁观模式仍有阴间滤镜
- 原版水瓶现在的堆叠上限被改为16
- 减慢了破坏竹子和浆果丛的速度
- 时运挖铜矿铁矿没有加成
- 扔出石块或燧石，砸向物块有20%概率掉落锋利（燧）石片？
- 铁皮药水的效果改抗性提升2
- 再次调整铜（48）、铁（128）工具的耐久
- 降低了骷髅的破甲强度
- 进一步平衡了穿甲流血机制
- 用燧石斧破坏晾干架后不掉落物品的bug

<!--绷带的奇葩bug？ debug hud bandage work 唱片联机测试 测试苦力怕爆炸穿甲伤害-->



## Beta 0.15.4

重大bug修复：

- 如果未开启死亡不掉落，玩家被怪物杀死后会不掉任何东西（仅0.15.3有此bug）！
- 手持水瓶左键会清空内容物！

优化：

- 用晾干架晒腐肉得到皮革时，腐肉和皮革取出后无法堆叠（未删除NBT计时标签）
- 修复了手持火把仍在黑暗中加速掉san的bug
- 小型史莱姆现在不造成恐慌
- 调高了铁制工具耐久
- 降低了跑步耐力消耗速率
- 耐力为0才会使玩家无法跳跃，而不是15%
- 火把不计入负重判定
- 左键倒出容器中的腐烂食物/咸水→改为合成
- 小白 盔甲韧性
- 加快砍树速度
- s2c不同步 breaking speed 客户端检测不到debuff?

<!--已经有了：纯净水右键泥土不会将其转化为泥巴-->



## Beta 0.15.3

主要更新内容：

- 加强了盔甲的保护效果（伤害和出血减免）
- 听唱片能快速回理智，靠得越近回得越快（但5、11和13号唱片相反）
- 延长了剑的攻击距离
- 削弱了火焰弹的伤害

优化内容：

- 加大了负重debuff的耐力消耗惩罚
- 可以用腐肉做诱饵
- 增加了粗铜粉的掉率
- 调整了木和铜制盔甲的护甲值
- 现在苦力怕不会炸出圆石了
- 僵尸挖方块的速度受模组难度选项影响
- 僵尸有更强的攻击动物的欲望，并且被怪物杀死的动物不会掉肉
- 原来的绷带合成由16个改为8个
- 狼牙棒和纤维绳可以作燃料了
- 咸水瓶左键倒出
- 削弱了烤种子、虫子和烤虫子、竹笋
- 修复bug：腐烂的食物放在熔炉内不刷新，还能继续烤成不新鲜的→新鲜度为0时烤出的仍为腐烂
- 每升5级加一点生命上限改为每升4级加一点



## Beta 0.15.2

- 黑暗debuff最大减95%亮度变为全黑了（全瞎）
- 绷带使用后能加速回血50%，持续10s，但下次受到伤害后会失效
- 杀怪数量越多，越不容易恐慌
- 修复了以下bug：
	- debuff多时次序可能会乱闪
	- 达成条件（32天，出铜镐）仍然可能无法生成村庄
	- 灵魂受损复活后血量不是满的（非刻意设计）
- 优化了以下内容：

	- 检查更新已使用独立线程
	- 现在村庄不需要32天后生成，获得铜镐或铁镐即可
	- 削弱了骷髅的血量（2心）
	- 小僵尸的攻击力降低2.5倍
	- 挖黑曜石太慢
	- 黑暗中去世太快



## Beta 0.15.1

- 添加了下落时按住`Shift`能缓冲少量伤害的设定
- 添加了自动检查更新功能
- 游戏时间21点以后才能入睡
- 修复了以下bug：
1. 矛和狼牙棒能砍树
2. 矛挖土速度还行，以至于可以替代石锥
3. 游戏难度和赞助提示会在死亡后再次出现
4. 游戏难度显示有问题
5. 僵尸除非拿上了对应的工具，不然就不能破坏石头及以上硬度的方块
6. 幼年动物被杀死时掉落异常数量的小肉（最多的时候一只小鸡掉了10个小肉）
- 优化了以下内容：
1. 忧郁速度过快
2. 石锥挖掘过慢
3. 轻微出血再次受伤后从一下子跳到严重出血
4. 苦力怕炸木头或矿石或金块、TNT炸矿石和金块不会掉落物品
5. 降低食物饱和度所得（如熟动物内脏）
6. 僵尸的感知能力过强，还能透视（挑战模式保留）
7. 绷带使用前摇过长
8. 生命上限过低受伤容易大出血的bug
9. Mod欢迎提示过长


<!--现在difficulty总是默认relaxing 但是无重伤debuff却能失明-->

<!--https://www.mcmod.cn/post/3513.html-->



## Beta 0.15.0

- 更新了游戏难度选项，以满足不同玩家的需求
	- 模组游戏难度分为休闲、标准、挑战三个难度
	- 默认难度为标准
	- 调整难度：输入指令`/gamerule hcsDifficulty relaxing, standard, challenging`（作弊模式下，极限模式也能作弊）（后面会加其他调整方式和自由度更高的配置）
- 难度会影响以下内容（包括但不限于）
	- 玩家的“手长”（休闲模式+1，挑战模式-0.25）
	- 恐慌状态下玩家攻击的失败概率（休闲模式下不会恐慌）
	- 灵魂受损最多能扣除玩家的血量百分比（休闲模式下不扣除）
	- 初始最大生命值（休闲不会削减）
	- 夜晚和处于洞穴中的掉理智的速率（休闲模式减半，挑战模式翻倍）
	- 受伤等的debuff（休闲模式取消）
	- 流血受伤速率（休闲模式减半，挑战模式翻倍）
	- 漆黑是否致死（休闲模式不会，标准模式不会jump scare）
- 现在更不容易感冒了（需要0.6以下的温度才会增加感冒值）
- 修复了以下bug：

	1. 有时莫名其妙失血而死，尤其是san过低时发生——暂时删除了徒手挖方块会掉血（容易卡bug）
	2. 打制成功率过低（改为合成 现在是任意两个石块/燧石合成一个）
	3. 打树叶/燧石斧砍树太慢
	4. 与动态光源兼容不够好，手持光源仍然会受到黑暗的威胁
	5. 矿车奖励太丰盛
- 修复了村庄生成的bug（但愿）

<!--加了PersistentState的getter和setter，需要测试-->

<!--debug：获取不来rule，一直是默认值 参考源码 猜测是没有发送S2C包导致的，或者尚未初始化gamerules Left click on hard block to chip(you can also choose to craft)-->

<!--debug：修复徒手挖掘不流血、或隔一段时间再挖就不受伤？StatusManager jumpscare没了 客户端方面gamerule存在问题，先弄个S2C包解决-->

<!--~打制石块和燧石的成功率（休闲模式必掉？，挑战模式大致减半）- ~打制重写！！！熟练度- 改为合成方式（石块×2，燧石×2合成锋利） [21:00:32] [Server thread/ERROR] (Minecraft) Couldn't load structure minecraft:village/savanna/villagers/baby-->

修改教程

僵尸感知距离？

村庄生成有时会无视限制

debug：复活会重新提示难度和赞助



## Beta 0.14.2

- 修复了无法炼制恒温药水和制作羊毛套装的bug
- 将玩家的手长距离延长了0.25格
- 灵魂受损现在最多只能扣除玩家50%的血量了
- 降低了恐慌状态下玩家攻击的失败概率（减半）
- 提高了打制石块和燧石的成功率
- 降低了夜晚掉理智的速率
- （废弃）挖砂砾掉粗铜粉的概率提高了50%  "chances": [0.12, 0.18, 0.3, 0.42]



# 硬核生存开发计划



## 初期主线

- ~~割草：提示要火烘干~~
- ~~烤种子~~
- ~~干草燃烧太快 不涨经验x~~
- ~~降低木棍爆率~~
- ~~回忆药水、铁皮药水名称（放弃）~~
- ~~挖掘算法、挖持续缓慢掉血（一开始不掉，每5s1心，线程）~~
- ~~添加食物github.com/Kelvin285/MITE-Reborn/blob/master/src/main/java/kelvin/mite/mixin/item/ItemMixin.java~~
- ~~煎蛋 沙拉？x 野菜？x~~
- ~~挖掘速度 废除木石开采能力   木剑改木棒~~
- ~~生火（火弓+火绒+木棍+熄灭的篝火）、x篝火要燃料（gui×Q√showTipMsg亮度）、~~~~掉落物（无？）徒手挖试试~~
- ~~削弱x删除v木石~~
- ~~石头可以扔，但是有CD+粒子~~
- ~~玩家徒手攻击减弱（不好？）没用攻击力！！~~
- ~~食物：虫子&野菜（挖草）、南瓜片（南瓜合成）合成南瓜子x1~~
- ~~石头和燧石工具~~
- ~~铜机制~~
- ~~铜装备~~
- ~~修改防御机制：皮2锁4铜8金6铁10钻15合20~~
- ~~攻击距离！（配合AI）~~
- ~~生物：动物（逃、反击x）、增加动物血量（牲畜比人更厚），且会回血；~~僵尸挖土（目标、是否被挡、挖掘）
- ~~建筑：死村、非自放箱子（包括矿车？？算了，还是移除里面的金属吧）要撬开，装有物品的箱子不能破坏和炸毁  漏斗~~
- ~~回忆药水~~
- x~~尸毒~~、~~蜘蛛吐丝~~
- 优化：~~animalmaxhealth（skeleton）爆率、蜘蛛bug、金块、~~x~~三叉戟限采集？~~、再次研究InventoryScreen、x~~长草长蒲公英~~、x~~骑行和空气UI优化~~、吃牛奶、~~掠夺哨站删铁傀儡、合成配方丢data/minecraft（无效）~~

> bug:/gamerule randomTick 万 会导致挖方块延迟
> （现原版已修复）原版也会在联机时离线模式客户端为主机，导致正版用户进去没显示皮肤



## 食物改革

> 本部分始于“状态初步”（GUI重写、生命、饮水）之后

~~动物内脏、肥肉、~~

~~花吃了消除疲劳值，补血~~

~~骨头（—骨器）~~

~~破竹要刀，消耗挺多 ~~x~~制作木板也一样~~

~~竹笋（竹子最高破坏底部，～～且四周有竹子）、竹节（1个就行，竹子多没意义）+瓶合~~

~~烤胡萝卜、浆果~~

~~成水时候返还1个虫子~~

~~削弱虫子营养、烤虫子（减少反胃）~~

*削弱虫子：狂掉san*

~~南瓜汤（生熟）、x水碗~~

~~浆果到处有，用铲子移植，但是难以繁殖，需要扦插（一个植株+）~~

~~浆果丛的bug：种1耗2   万物上可以种（canplaceat背锅）  preventDefault闪现、喝水失效、~~

~~沙子掉落~~

~~挖矿药水~~

~~钓鱼更新、内脏可以当诱饵~~

~~削弱浆果饱食度~~

~~饱食度进度条优化~~

x~~吃蒲公英不开心~~

~~作物生长减速 包括浆果~~

~~thePlayer==null使得吃种子等空指针eatFood()~~

有~~多人模式下正版账号连盗版时皮肤显示异常的bug？验证原版是否也有~~

~~网络：S2C packet 学习dehy~~

~~isWorldFirstLoad和theplayer在多人模式下的debug~~

~~debug：新手大礼包 重进游戏重复给 -\>readNbt - nbt.contains~~

~~debug：饥饿耗水~~

~~debug：药水箭名称~~

~~optimize：口渴加速+喝水后一段时间保持不渴~~

~~debug：不显示Exhau~~

~~debug：饮水数据发送时常失灵、归零多人时常掉血失灵~~

~~debug：不能同时受到口渴伤害ticks变量bug（x需要实例化而不是僵化的内部类）~~

x~~debug：水冲掉草和浆果丛不掉落 蕨不掉 发光浆果~~

~~optimize：食物补水 eg.苹果甘蔗西瓜~~

~~optimize：x删除thePlayer 水100~80%的比例显示 用自定义函数如反比例+一次分段~~

~~optimize：减慢饥渴致死速度~~

- ~~食物变质~~
    - ~~Nbt的读写~~
    - ~~GUI~~
        - ~~appendTooltip~~
        - x~~仿DS渲染~~
    - ~~容器（不会影响速率）、背包随机刻~~
    - ~~保质期分异（排除蜘蛛腺、九死）~~
        - ~~“通常来说，生肉、生鱼、腐肉、海带的变质速度递增量很快。熟食，蔬菜会慢一些，谷物很慢，干海带最慢”~~
    - ~~optimize：温度计算~~
    - debug
        - ~~手持食物无法渲染~~
        - ~~心的闪烁问题~~
        - ~~手持食物无法挖掘setBlockBreakingInfo mixin不要重置（直接禁挖）+optimize：挖土受伤（之后的医疗系统）~~
        - ~~自动堆叠x按P堆叠按键绑定：看一下如何shift锁定?为什么扔出物品可以 在inv内使用？~~
            - ~~自动堆叠从箱子拿出没反应的bug//if(fresh \<= 0.0F)continue;~~
            - ~~过于频繁：bobtime~~
            - ~~物品stack数量失控递增至64~~
            - ~~返鲜&平均时间暴增bug~~
            -  不存在的~~探究：为何离开updatefreshness或者在inv以外使用会导致新鲜度归零~~
            - ~~无法转移物品→按P~~
            - ~~长期变质 time平均下来会严重拖后腿→变质食物~~
            - ~~忽略了last update time的nbt作用~~
            - ~~堆叠尽量保留原来的位置~~
            - ~~食物不能手动铺开，\>1组不能任意位置~~
            - x~~每隔2tick检查一次 免得S2Csync出问题 ？？？直接不要fresh的nbt，在冰箱里才要，拿出来根据新鲜度推算所谓的“初始时刻” 温度影响改作getExpiry，暂时先别实装~~
            - x~~subNBT?~~
            - ~~optimize：反馈邮箱~~
        - ~~退游重进食物新鲜度暴跌~~
        - ~~重写变质~~
            - ~~删除新鲜度，改用expiryDate~~
            - 并不会~~debug：看带到下界、末地是否会刷新HI和HE（主要是时间是否同步）~~
            - ~~debug：出现两个相同物品堆叠立即腐烂 建议只取expiry一个，不要init，新鲜度用remain/expDate计算（冰箱则需要x也不需要init，每个tick之后expiry延后0.9tick）~~

    //只存在一个NBT的新鲜度计算与保质期调整
    now world time: now=100（fresh=(exp-now)/expDate）calculate when need
    out of fridge: exp=1000  expDate=1000
    put in fridge: expDate=expDate×10=10000→exp=now+expDate×fresh=9100
    take out: exp=now+fresh×expDate
    //用long类型表示expiry完全不用担心超出上限的问题，因为达到上限需要100多亿年getExpByFresh ,wt=world.getTime()
    fre=(exp-wt)/expDate
    fre*expDate=exp-wt
    exp=fre*expDate+wt

- ~~删除手持食物挖掘限制和切换物品动画僵直~~
- ~~删除变质depreciated变量~~
- ~~容器食物变质不会被替代~~
- ~~腐烂食物~~
    - ~~直接贴腐烂标签就行x碗装食物腐烂直接返还碗~~
        - ~~开局送碗~~
        - ~~左键倒出容器中的烂食物~~
        - ~~当肥料、燃料（both DS and mod）~~
        - ~~debug：食物堆叠可能命名消失（禁止不同命名食物堆叠）~~
        - ~~debug：甘蔗腐烂不会被替换~~
        - x~~debug：熔炉、潜影盒、末影箱、漏斗新鲜度~~
        - ~~optimize Exp： √糖 海龟蛋 √可可豆 √鸡蛋 √netherwart √honeycomb √fishes √bakedpotato √honeybottle √fermentedspidereye √rabbitfoot √potherb~~
        - ~~重写invTick（仅用于检测是否到保质期）~~
        - ~~削弱腐烂食物肥性（不能催草）~~
        - ~~修饰语：新鲜阶段与减益：新鲜、不新鲜、变质（仍然可以播种）x提前做掉San~~
        - ~~打制debug 无法挖的方块打不了~~
        - 
        - ~~新鲜度用保质期+等级表示  x新鲜度用进度条显示？e.g.■■□□□~~
        - ~~金食物、腐肉和x蜂蜜x不腐、兔子脚&蛋糕&奶桶腐~~
        - ~~兔子脚可食~~
        - ~~植物种植+收割，卡bug新鲜度拉满→一级苗啥也不掉x不新鲜的？，胡萝卜种子？甘蔗放任~~
        - ~~optimize：碗倒出腐烂食物~~
        - ~~烹饪新鲜度~~
            - x没有办法~~debug：combine output~~
            - ~~optimize：合成食物~~
            - ~~debug：campfire invalid(see at gui)~~
                - 
        - ~~/give @s food{"hcs-foodExp":0.01}~~
        - x~~烹饪与新鲜度~~
        - ~~randomgametick影响？不会~~
        - x~~食物×1 扔出后可能虚物品→fresh刷新慢一点，每2tick~~
        - ~~食雪~~
        - ~~吃种子bug~~
        - 保鲜
            - ~~冰箱（更改 变质提示时间）学习 x联机考虑：是否为永鲜？x 检测世界上是否有玩家？8铁锭1红石块 自定义方块实体~~
                - ~~建模~~
                - ~~方块属性 镐子为开采工具~~
                - ~~合成~~
                - ~~掉落物~~
                - ~~破坏时间及徒手~~
                - ~~旋转~~
                - ~~~~[浸水](https://fabricmc.net/wiki/tutorial:waterloggable)
                - 容器
                    - ~~entity→tickable~~
                    - ~~UI→inv~~
                    - ~~nbt~~
                    - ~~markDirty→手动读写nbt~~
                    - 延缓5倍变质
                        - ~~根据速率、新鲜度计算保质期~~
                        - debug
                            - ~~冰箱内保质期乱跳~~
                            - ~~从冰箱拿出来保质期失常~~
                            - ~~手持食物开冰箱会吃~~
                            - ~~防止玩家下线后背包食物继续腐烂→玩家写入nbt/离线背包食物nbt exp改新鲜度，上线再读取~~
                            - ~~缩短保质期~~
                        - 
                        - ~~冰箱东西进出重置expiry？~~
                        - ~~温度影响是否要实装？不太现实！！~~
                            - 
                            - 
                                - 
                                - 
                                    - 
            - 
            - 风干——[晾干架](https://www.mcmod.cn/item/51998.html)
                - ~~一格的体积做两格的事；放置占位上方的一个方块 x两格高（两个方块绑定） 无法放置上方的方块 ticker need block entity PS：useBlock/Mixin-\>canPlaceAt可以试试~~
                - ~~debug：沙子落在上面不会被摧毁~~
                - ~~合成~~
                    - ~~棍 棍 棍~~
                    - ~~棍 线 棍~~
                    - ~~棍     棍~~
                - ~~参考材质（DS）~~
                - ~~方块属性 重写类~~
                - ~~inv模型 偏移调整~~
                - ~~block mineable tool~~
                - x~~[15:37:32] [Server thread/WARN] (Minecraft) Rejecting UseItemOnPacket from Player636: Location (-39.17841485644074, -58.375, 18.535297261032856) too far away from hit block Mutable{x=-40, y=-60, z=18}.~~
                - ~~warn block entity~~
                - ~~loot table without tool~~
                - ~~物品渲染+倒挂 xxxxx不会？xxxxx召唤展示框？~~
                    - ~~S2CPacket~~
                    - ~~scale~~
                    - ~~direction~~
                    - ~~pos~~
                    - x~~debug：手持食物取出的bug~~
                - ~~肉干 分生熟+烤熟肉干 测试Drying rack use~~
                - ~~肉干回血 生的不回san~~
                - ~~腐肉晒皮革 海带晒干~~
                - ~~optimize：挂肉获得冰箱同等效果  x 暂停腐烂~~
                    - ~~property-dryTime（同exp） + nbt saving  3天晒干，并立即createExp~~
                        - ~~nbt read&write&ticker~~
                        - ~~update() !isOnRack→delete nbt~~
                - ~~precipitation stop drying（每tick+1exp）~~
                - x~~debug：手持相同物品取下，会导致仍然保持渲染已取下物品 空手有时也会~~
                - ~~optimize：口渴掉血不要用随机数，用world.getTime()%20==0~~
                - ~~debug：卡住~~
                    - ~~DryingRackBlockEntity~~
                    - ~~DryingRackBlock x 死因：IntProperty DRYING~~*TIME*REMAIN 过长→改成stack注入nbt
        - x~~多人模式test？~~
        - x~~百分比显示~~
        - x~~花变质？？~~
- ~~debug：虫子不应该腐烂？x~~~~牛奶加饥饿~~~

~~optimize：i~~~~i和--i~~

~~3任意花 花瓣沙拉~~

~~debug：鸡蛋不变质 向日葵腐烂~~

~~debug：碗食物堆叠无极限~~

~~野菜重做~~

~~optimize：食物补水~~

~~optimize：体力可见~~

~~加入水果：橘子~~

x~~关于我的测试超平坦存档卡bug生成正常村庄这件事~~



~~debug：饮品减益 包括牛奶减饥饿~~

~~任何作物一阶收割的种子都不新鲜（+甜菜、小麦、二瓜）~~

~~optimize：发芽土豆可以种~~

- ~~前期优化~~
    - ~~草纤维，纤维绳   绳子重绘 藤条制绳 合成配方 short stick~~
    - ~~基础工具合成配方~~
    - ~~打草掉率修改 纤维↓木棍↑~~

x~~debug：appendInfo is invalid to creative mode's Tags~~

~~狼牙棒mace/spiked club——嵌入锋利断骨~~



### 优化1

*重写饥渴机制*

- ~~optimize：饥渴掉速先快后慢~~
- ~~optimize：饥渴改革~~
- ~~跑跳不应掉太快，平时也掉得慢~~
- ~~走路默认不掉要改→走路掉~~
- x~~原来的食物和水也补不了那么多了~~
- x~~吃种子等~~
- ~~debug：水掉太慢（相对于饥饿）~~
- ~~thirst manager cooldown debug~~
- ~~检验结果通过：正常游玩1.2~2min半鸡腿→1min 0.5~0.8半鸡腿→一天13半鸡腿~~
- ~~mod兼容：开头将材质设为空，取代ci.cancel(); x不是单纯重写render，而是具体重- 写对应的状态渲染函数~~
- ~~optimize：氧气数值居中~~
- ~~optimize：坐骑maxHealth显示位置~~
- ~~重新学习mixin：~~[官方](https://fabricmc.net/wiki/tutorial:mixin_examples)+b站
- ~~@Invoker @Shadow异同~~
- x~~optimize：data fixer ~~

~~debug：直接放置泥土悬空不会塌陷~~

- x~~optimize：变质直接scheduledTick，一举多得~~
- ~~optimize：xxxStarving改Famished，dehydration改dehydrated~~
- x~~optimize：腐肉烧皮革~~
- x~~optimize：自定义异常 通常在helper~~
- ~~optimize：直接计算出变质时间并写入nbt，而不是一直计算 冰箱可以再改（延后变质时间，模拟提前初始时间）~~
- ~~水瓶堆叠64改16~~
- ~~设置简单模式僵尸不会挖方块？？~~
- x~~checkVisbility 村民无效~~



- ~~debug：僵尸晃头 疯狂设置目标玩家导致       ~~


~~optimize：燧石 爆率太低~~

- 重写僵挖：
    - ~~已尝试失败思路总结~~
        - ~~tick（goal运行时）将zombie的移速设置为0→zom专注于挖方块而不是追踪target~~
        - ~~通过是否能走向玩家判断是否要start goal→path的终点位置与target位置距离在1以内→结果发现不同的y会导致距离超出1，甚至有时候会达到8+~~
        - ~~Mixin wanderAroundGoal 取消zom类实体有目标时的canStart但是不起作用zom仍然会漫游当无法接近目标时~~
    - ~~~~[模仿](https://github.com/SrGnis/Creeper_AI_Updated/tree/master/fabric/src/main/java/com/srgnis/creeperaiupdated/goals)[模仿](https://github.com/SrGnis/Creeper_AI_Updated/tree/master/fabric/src/main/java/com/srgnis/creeperaiupdated/goals)
    - x~~思路：先追踪，距离够近再挖canStart()内调用findPathTo(target)，直到贴近~~
    - x~~难点：靠近待破坏方块有一段距离，如何选定？？~~
    - ~~掉落物   ~~
    - ~~手持的增益工具~~
    - ~~距离：2.25~~
    - ~~受伤打断目标~~
    - ~~husk test~~
    - ~~不冲突  与破门是否冲突~~
    - x
    - ~~取消重写xxx@Redirect goal~~
    - ~~xxxxxxxx原版破门太慢且不渲染~~
    - ~~debug：checkVisibility只有暴露视野1次时才能生效~~
    - ~~/gamerule~~
    - ~~简单模式不会？？防止投机取巧~~
    - ~~快挖完就离开→自定义Goal&挖掘提速~~
    - ~~僵尸摇头晃脑原版就有，不用修~~
    - ~~blockstate~~
        - ~~补方块e.g.堆肥桶变泥土→world.syncEvent~~
        - ~~补方块立刻破损→检查方块更新~~
        - ~~挖方块不塌陷→updateForDirt()~~



[AccessWidener Point Reference](https://fabricmc.net/wiki/tutorial:mixin_injects)



x~~攀爬？~~

~~optimize：生命san图标递减先快后慢y=根x  × y=log2(2x)~~

~~optimize：UI显示口渴40%以下下降慢~~

~~optimize：饥渴值下降渐进式先快后慢，体温同理？~~

x~~optimize：GUI微调，缩小？~~

x~~optimize：缺氧气泡图标变小~~

x~~optimize：徒手摘花得花瓣？~~

x~~懒且复杂xbuff ：模仿PZ竖排排列，tooltip改变~~

x~~重写GUI使之成为加速球状，并适当隐藏数值，~~

~~考虑和其他mod兼容~~

x~~思考之前不能同时受伤的原因 静态变量是否联机玩家共用~~



## 状态

- 生命：~~蜘蛛腺~~、~~九死~~、x~~蜂蜜治疗、水晶~~
- GUI：~~删除3、氧气和坐骑HP调至右下角、等级数值下移~~、~~湿度放右下角，必要时显示；护甲放背包UI~~x自定义示数大小
- ~~测试：极限、伤害吸收、待会下楼拿快递~~
- debug：~~同步gameProfile~~、~~村庄优化~~
- ~~猜想：foodlvl等在server和client之间存在serverPacket~~





### 饮水

- ~~联机debug：ThirstManager——动态，每个Ent自己实例化一个~~
- bug~~口渴不能跑~~、~~堆叠~~、~~蜂蜜瓶牛奶食物补水~~、x~~牛奶无法消除的buff、空手+shift+右喝水~~、~~借鉴dehyd、失水和净化（+脏水、咸水）~~
- ~~按照Fn的静态int在HUD里面用cmd设置饥渴、竹子和仙人掌取水、直接喝水呢~~
- ~~新手大礼包：送燧石石锥（防掉坑无法挣脱）~~、
- ~~~~~[新手大礼包](https://www.mcmod.cn/class/5162.html)
- ~~[净化](https://fabricmc.net/wiki/tutorial:cooking_recipe_type)
- ~~、堆叠~~x~~水罐？~~
- ~~onuse是否适用于发射器x纯净水~~
- ~~删除脏水（包括useItem）+仙人掌汁语言+add纯净水+烧纯净水+和平模式不掉口渴~~
- ~~回城药水+炼药~~



### 耐力

- ~~manager~~
- ~~GUI~~
- ~~Debug：~~
    - ~~跑步狂掉——直接tick isSpirinting~~
    - ~~复活后卡住不掉~~
    - x~~精确到小数点后7位~~
    - ~~拉弓无箭矢fail仍然掉体力~~
- 消耗
    - ~~走路不掉也不升~~
    - ~~跑跳、游泳、攻击、挖掘、攀爬（爬楼梯）？？~~
    - ~~拉弓、扔石、锄地、铲地~~
    - （后面加）恐慌状态下掉得更快
    - ~~再次调试多人@Inject(at = @At("TAIL"), method = "addExhaustion")~~
    - ~~惩罚——炸肺debuff：减攻速、攻击力、挖掘速度、移动速度（+不能跑）~~
- 恢复
    - ~~杵着不动~~
    - （后面加）坐在地上
    - ~~吃饱喝足睡大觉~~
    - （后面加）咖啡、茶？
    - （后面加）省力附魔 - 同时盔甲附上会缓解负重debuff
    - ~~力量药水恢复~~



~~Mixin @At 和@Method换位置~~

### 温度

- ~~计算环境温度~~
    - ~~由原版温度数值变换（注意平滑）~~
        - ~~自定义改动部分原版群系默认温度~~
        - ~~解决accesswidener问题→isCold isHot~~
        - ~~高度因素：洞穴、高空~~
            - x~~y=40恒温层温度 temp与0.5平均数？？~~
            - ~~检测是否是超平坦踩坑：skylight、mood（在ClientPlayerEntity）~~
            - ~~world.getTopPosition(Heightmap.Type.WORLD~~~~\_SURFACE~~\_~~WG, pos)、world.getRegistryManager().streamAllRegistries().anyMatch(entry -\> entry.key().isOf(RegistryKeys.FLAT~~~~\_LEVEL~~\_GENERATOR\_PRESET))\_
    - ~~河流、沙滩：更温和、基础温度由邻近群系决定~~
    - ~~丛林温差减小~~
    - 
    - ~~气温日变化~~
        - ~~振幅（降水/群系影响：沙漠大、河海小）~~
        - ~~天气影响（晴 多云 雨雪）~~
        - ~~正弦型函数建模~~
    - ~~方块冷热源~~
- 体温
    - ~~升降~~
        - ~~浸水失温~~
        - ~~惩罚~~
            - ~~debuff两级，前1级属于警告~~
            - ~~pre-damage cooldown~~
            - ~~扣血debuff~~
                - ~~贴图~~
            - ~~过热视野特效~~
        - ~~烈日/寒风debuff~~
            - ~~lvl~~
            - ~~影响~~
        - ~~发热：运动的结果~~
            - ~~运动（??x仅限非炎热\<0.7??越冷效果越好？？）~~
        - ~~optimize：manager getInt setInt getString setString~~
        - ~~睡觉~~
    - 调节
        - 吃
            - （后面加）吃冰
            - （后面加）吃雪糕
            - ~~冷饮  www.mcmod.cn/item/9295.html~~
            - （后面加）北瓜
                - 紫白色，自然生成？？（或者打草？溺尸掉？→nbt改动战利品列表考虑兼容性）
                - 继承原版瓜类
                - 食用恒温10s，酿造效果提升
        - 穿
            - ~~羊毛、皮革衣物~~
            - （后面加）硝石套装
            - （后面加）盔甲打蜡防水
            - （后面加）草帽
            - *盔甲附魔：恒温（没有等级，每一件使变温速率减半，四件同时有就满）——会不会取代北瓜？*
                - （后面加）村民交易、地牢生成
            - （后面加）伞帽（ps：除了隔热，还可以消除烈日debuff）
        - 用
            - （后面加）空调
            - ~~（大热）水袋 large~~
                - ~~物品合成~~
                    - ~~皮瓶皮~~
                    - ~~皮瓶皮~~
                    - ~~皮皮皮~~
                - ~~nbt技术问题（热水袋温度的升降）~~
                    - ~~看clock和compass解决不了，找别的github开源~~
                    - ~~nbt手持物品闪烁问题~~
                        - ~~coolDown subNbt @Overrride item：：isNbtSynced(){return false}解决不了~~
                        - ~~expiry思想~~
                - 加热或冷却
                    - ~~nbt技术问题~~
                        - ~~自定义配方~~
                    - ~~篝火/熔炉配方~~
                    - ~~冰箱~~
                    - ~~tooltip~~
                    - ~~灵魂火相当于冷火，给热水袋降温~~
                    - （暂时不加）x~~靠近热源加热？？~~
                - ~~实装：对玩家体温的影响~~
- （后面加）指标：温度计
- 







### 优化2

- ~~debug：不停地createExpSlow~~
- ~~debug：容器内不expSlow~~
- ~~debug：手持热水袋甩手~~
- ~~debug：HHEP温度显示异常~~
- ~~debug：熔炉输出stack的nbt不刷新 protected void onCrafted~~
- ~~optimize：体力掉得更快（尤其是跑），恢复更快，且惩罚更严重~~
- ~~optimize：变质天数仅精确到整天数~~
- ~~optimize：温度显示给字体颜色？~~
- ~~Reg标明自定义伤害源及VanillaDamageTypeTagProviderMixin设置属性~~
- ~~删除depreciated~~
- ~~工具性方块破坏加速~~
- ~~熔炉破坏加速，其他工具方块保持不变~~
- ~~debug ：工作台、铁砧路不动，末影箱太慢，熔炉&酿造台徒手不掉，泥土减速~~
- x~~tooltip gray→dark gray~~
- ~~debug：木棒拆草掉耐久~~
- ~~玩家使用盾牌不回体力；体力小于30%走路恢复超慢~~
- ~~热水袋尚未完工！！@override inv tick~~
- ~~再次运用exp思想创建新nbt表示刚开始冷却的时间，下次打开时计算过了多久，得出温度（在冰箱内不转换该nbt，通过appendTooltip，在外转换nbt为percent和stat）~~
- ~~debug：温度\>0的热水袋放冰箱秒冷or温度不稳定~~
- ~~冷→不冷：exp没转为init~~
- ~~热→不热：取出读取init，reset exp & stat~~
- ~~debug：热水袋位于熔炉output不降温和显示条~~
- ~~挖煤不掉经验~~
- ~~画stack耐久条表示温度（红、蓝色）~~
- ~~debug：冰箱内进度条失灵（受init影响）~~
- ~~optimize：xpLvl\>30不干涉（设置）maxHealth~~
- ~~optimize：nbt maxExpReached决定最大生命，即使后期掉经验也不要紧~~
- ~~死亡后返还绝大部分经验~~
- ~~debug ：当lvlReached判断满生命上限，复活后血量只有8点（初始最低上限）~~
- ~~debug：冒雨走路狂掉体力（判定为游泳）~~
- ~~optimize：口渴速度受玩家温度影响~~
- ~~optimize：撸甘蔗加速~~
- ~~optimize：工具拆花不掉耐久~~
- ~~optimize：矛、棍棒能拆草~~
- ~~花瓣沙拉贴图优化（轻微溢出）~~
- ~~optimize：减少熔炉经验获得，大幅削减杀怪掉经验~~
- ~~灵魂火相当于冷火，给热水袋降温~~
- ~~ 或每升5级2血~~
- ~~屠宰动物不掉经验~~
- ~~optimize：保质期显示颜色，无括号~~
- ~~optimize：继续修：damagesource 熔炉热水袋nbt刷新~~
- ~~optimize：饱腹能继续吃~~
- ~~骨头太好破局，而木铲失去作用→削骨（不好获得、~~*降低成功率*、耐久）
- 没法改x~~护甲值小数点；装备耐久小于一半削减护甲值~~
- ~~羊掉皮革~~
- x~~debug：空stack有hcsExp hcsDryDdl的nbt~~
- ~~热水袋加上说明文字~~
- ~~山上：烈日+寒风~~
- ~~热水袋——背包多个叠加无效~~
- ~~种子加饱和度重写饥饿机制（包括烤种子、烤浆果-并重画），并为其它mod兼容（getHungerlvl、saturLvl提供兼容）~~



- ~~debug：从93%跳到100%~~
- ~~保留饱和度，添加疲劳值与饥饿水平的联系以方便像饱食度+3%这种不是整5%的操作~~
- ~~debug：西瓜种子20天保质期~~
- ~~optimize：保质期显示，Math.ceil代替round~~
- ~~optimize：降低烤种子经验获得~~
- ~~optimize：吃烤种子不是2%~~
- ~~debug：吃了没反应~~
- ~~吃撑和饥饿并存~~
- ~~debug：吃撑用牛奶解~~
- ~~烤发光浆果~~
- x~~吃撑：status manager count~~
- ~~吃撑debuff（有tip）：吃饱/喝足后连吃额外的1%~50%+ 目前减速~~
- ~~（饱和度如果有就在下方显示）~~
- ~~debug：RotHelper.world==null in cookingRecipeSerializer →引入新nbt提示加热？？~~
- ~~debug：damageSources的不同world问题（多玩家能否同时受到伤害）吃东西~~
- ~~optimize：在熔炉inv里的物品自动刷新~~
- ~~optimize：hotwaterbottle tooltip 在快捷栏上生效？？ 可加热也可冷却~~
- ~~optimize：hotwaterbottle 显示温度色块~~
- ~~optimize：hotwaterbottle 灵魂篝火烤热水袋降温~~
- ~~optimize：熔炉、灵魂火对环境温度的影响~~
- ~~optimize：疾跑更容易累~~
- ~~optimize：打草爆率降低~~
- x~~optimize：烧水、热水袋加速~~
- x~~糖1甘蔗做3？~~
- ~~打草打花速度调快~~
- ~~减少食物水分摄入~~
- ~~优化贴图深色边框，使之具有立体感~~
- ~~画好羊毛外套贴图~~
- x~~optimize：蹲下延长攻击距离~~
- ~~optimize：羊毛外套贴图——实物模型袖子改短 icon改长~~
- ~~optimize：游泳烈日闪烁~~
- ~~debug：雪天雪原清晨不跑冻死，跑体温0.7~~
- ~~optimize：热带草原阴凉处算法~~
- ~~optimize：热带草原晚上比预期冷→提高C，减振幅~~
- ~~optimize：沙漠阴凉处算法 //DONE TODO isRaining prevents strong sun~~
- ~~debug：沙漠雨天（阴天）热到离谱~~
- ~~optimize：灵魂火保证不会热死（附近有岩浆除外）~~
- ~~optimize：徒手喝水降温~~
- ~~debug：death.attack.-heatstroke~~
- ~~optimize：heatstroke overlay：上下对称~~
- ~~debug：wool item model~~
- x~~debug：wool armor overlay：不能显示~~
- ~~optimize：temp saturation~~
- ~~optimize：语言编号——tip、药水、配方idfier~~
- ~~optimize：西瓜片2天、南瓜片3天容易坏~~
- ~~optimize：寒风室内不会有（方块光源\>0 && 天空光源\<14 && x头顶不是树叶？）~~
- ~~debug：风寒不是4级就是0级~~
- ~~snowyTaiga升温~~
- x~~optimize：InGameHud renderHeldItemTooltip()~~
- ~~optimize：英文debuff描述的字体缩小~~
- x~~chilly wind&windchill strong sun&blazing sun~~
- ~~僵掉骨~~
- ~~溺尸、husk是否已删掉铜~~
- ~~打制成功率与等级正相关~~
- ~~中暑buff icon改 chat&deathScreen时显示异常~~
- ~~防火buff不中暑~~
- ~~heatstroke blur 透明度随程度而变~~
- ~~丛林、石滩温度优化~~
- ~~细雪内失温~~
- ~~debugHUD thirstmanager sat显示异常 + auxExhauS2C合并至thirst~~
- ~~徒手喝水debug~~
- ~~tooHotOrTooCold~~
- ~~着火升温~~
- ~~appendTooltip显示攻击距离加成~~
- ~~debug：player.isWet降温时排除淋雨~~
- ~~debug：西瓜不腐烂 南瓜不能垫脚~~
- ~~debug：失温1雪花/中暑1火焰不显示渐变~~
- ~~骨头、木棍打人有几率断掉（分别变成锋利断骨、短棍）~~
- ~~rewrite：theWorld thePlayer~~
- ~~optimize：回血红心部分不用闪~~
- x~~森林0.4～0.6温度显示不明显→振幅改为0.15~~
- ~~debugHUD temp显示异常~~
- ~~温度不舒适时恶化减慢~~
- ~~//冰雪降温摇摆bug~~
- ~~心闪烁优化：闪太厉害、受伤不及时~~
- ~~攻击距离~~

**代码中非client环境不要出现ClientPlayerEntity否则Server运行会找不到类出错**

- ~~C2S packet~~



- ~~攻击距离~~



### San

[参考Mod](https://www.mcmod.cn/class/6400.html)

- ~~GUI~~
    - ~~san值升降指示箭头（半透明、轻微晃动）~~
        - ~~debug：不停地闪且大小不固定~~
        - ~~牛奶不会喝撑~~
        - ~~箭头晃动速度由下降速度决定~~
    - ~~掉和升时边框闪烁~~
    - ~~低san时图标上下抖动~~
    - ~~optimize：san\<50%图标显示偏低~~
- ~~数值变化~~
    - ~~掉san~~
        - ~~（继续测试）地表黑夜，无照明更快（skyLight\>0，isNight）；地下（skyLight\<0）~~
        - ~~扔末影珍珠~~
        - ~~在怪物旁边/怪物目标 instanceof PlayerEntity~~
        - ~~optimize：下界、末地掉san太快~~
            - ~~this.world.getRegistryKey() == World.NETHER~~
            - ~~world.getDimension().bedWorks()~~
        - ~~吃变质食物~~
        - ~~中暑、失温、中毒、凋零、【删】腹泻（0.06%/30s）~~
        - ~~debug：踩泥掉san（0sky 0block）~~
    - ~~回san~~
        - ~~持花 晒太阳~~
        - ~~吃EffectiveFoodItem~~
            - ~~特殊食物，如海带干~~
                - ~~海带干不能烤了，只能晾干~~
                - ~~区分烤海带（mod，专为烹饪设置）与干海带（原版，魔改为只能晾干架制作）~~
            - ~~新鲜美食，如煲、南瓜派、烤肉~~
        - ~~睡觉（扣水食回血）~~
- ~~惩罚~~
    - ~~debuff：精神错乱（insanity）~~
    - ~~幻听~~
        - ~~debug：播放唱片~~
        - ~~随机播放阴间音效~~
        - ~~听不到外界声音？~~
            - ~~SoundManager.stopSounds~~
            - x~~sound manager accessor setter shouldMute~~
            - x[自己找 or deafDebuff 1.12.2](https://github.com/WayofTime/BloodMagic/tree/1.18.2/src/main/java/wayoftime/bloodmagic)  
            - xxx~~参考greenhell 理智低 归零自杀~~
            - （废案，暂时不加）~~呓语已经在百度网盘assets/sounds里了~~
                - ~~注意：此时要关闭BGM最好加上自带的一些阴间白噪音~~
                - [来源](https://freesound.org/people/geoneo0/sounds/193815/)[音效包制作](https://www.bilibili.com/video/BV1j8411s71M)[音频压缩](https://www.compresss.com/cn/compress-audio.html)
    - ~~幻视~~
        - ~~血丝边框+闪动~~
        - ~~阴间滤镜（黑白）~~
            - ~~GameRenderer loadProcessor~~
            - ~~颜色随san渐变（10个阶段拟合渐变）~~
                - ~~不要用代码搞平滑渐变了（难度、不停换postProcessor严重掉帧）~~
                - ~~debug：复活滤镜重置失灵、再次检查滤镜~~
                - 
                    - 
                    - 
                    - 
                    - 
                        - 
                        - 
                            - 
                        - 
                        - 
        - ~~看到不存在的~~
            - （暂时不加）~~			眼睛~~
            - ~~怪物、人形~~
            - ~~靠近消失~~
            - ~~debug：随机实体鬼畜（离开初始一定距离后）~~
            - ~~物品（San\<10%）和字幕（San\<15%）乱码（HUD+名称显示+抽象储物UI）~~
            - ~~San\<5%，看自己和别人成怪物~~
                - ~~optimize：手臂 xGamerenderer/renderHand/this.firstPersonRenderer.renderItem但是只支持ClientPlayerEntity类型~~
        - ~~debug：切换人称视角，PostProcessor失灵~~
            - ~~参考相关代码，是否重置Identifier/camera.isThirdPerson()~~
            - ~~（已修复）游戏自带按F4禁用PostProcessor~~
        - ~~debug：创造模式仍受阴间滤镜影响~~
        - ~~optimize：幻觉程度过渡（渐变）~~
        - （是否删？）雷雨天掉san？



### 营养



- ~~optimize：所有BigDecimal改Double~~
- ~~manager、S2C~~
- （后面加）optimize：根据饥饿消耗去减百分比
- 分类
    - ~~果蔬~~
    - （后面加）蛋白质
    - （后面加）糖类
    - （后面加）盐类：尤其是出汗流失
- （后面加）UI
    - [护甲值UI移动到背包UI内](https://www.mcmod.cn/class/3599.html)
    - ~~营养不良图标：碗里装骨头~~
- （后面加）判定
    - [兼容列表见](https://www.mcmod.cn/class/1271.html)



### 洞穴



- ~~深处缺氧~~
- ~~恢复氧气~~
    - ~~\< map.highest 且为草方块~~
    - ~~附近有树叶~~
    - ~~水下呼吸延缓~~
    - ~~水下呼吸药水~~
    - ~~封死检测~~
- ~~优化：氧气产生渐变~~
- （后面加）氧气消耗速率与运动剧烈程度成正比
- （后面加）有害气体
    - 扬尘
    - 易燃易爆
        - 瓦斯（主要CH4）：火把插煤
        - 沼气（主要CH4）：沼泽地下（近地面）



### 湿度



- ~~数值~~
    - ~~Manager~~
    - ~~UI~~
- ~~加~~
    - ~~淋雨（雪不会）~~
    - ~~泡水~~
- ~~速减~~
    - ~~烤火~~
    - ~~高温~~
- ~~惩罚~~
    - （后面加）~~Debuff~~
        - x~~减速~~
        - ~~降低体感温度~~
    - 别加！x~~高湿度且离开水→缓慢掉San~~
- （后面加）防水
    - 盔甲打蜡
    - 防水附魔
    - 防水药水
- （后面加）打湿粒子效果



### 优化3

- ~~版本号？要不要~~
- ~~对玩家位置监测prevX代替LastPos不行~~
- ~~锁定挖掘（左+右）~~
- ~~新手大礼包添加恒温药水（暂时不提供酿造）~~
- ~~optimize：掉水速度调慢2~3倍~~



- ~~debug：测试服务端运行~~
- ~~debug：大修挖掘速度算法，如：石刀、木棒挖土太快~~
- ~~口渴、饥饿速度调快，水瓶补少~~
- ~~僵尸感知范围调低至32~~
- ~~调高打制掉率~~
- ~~debug：兔子死后又掉兔肉又掉小肉~~
- ~~攻击距离拉长~~
- ~~树苗合成木棍~~
- ~~复活状态不满 饱和度0~~
- ~~打树叶速度慢一点~~
- ~~调低木棍掉率~~
- ~~花瓣汤削弱~~
- ~~黏土块受重力影响~~
- ~~新手大礼包去掉水食~~



- ~~死亡惩罚~~
    - ~~san无所谓~~
    - ~~灵魂受损（生命上限-25%），九死还魂草/金苹果xxx强心针消除~~
- ~~debug：营养不掉~~
- x~~debug：河边钓鱼温度拉满~~
- ~~debug：多人模式体力掉光有debuff无效果~~
- x~~debug：地下树叶氧气回不上去（偶尔）~~
- ~~debug：铜剑打树叶慢~~
- ~~生长周期缩短~~
- ~~粘土块悬空粒子效果~~
- ~~debug：[17:58:36] [Server thread/INFO]: [STDOUT]: stone~~~~\_cone~~
- ~~潮湿惩罚：xx打东西掉出去；减速8%~~
- ~~0san：小黑激怒音效~~
    - ~~该幻听过长，san恢复后取消~~
- ~~再加快饥饿速度20%（模仿MITE）~~
- ~~新手大礼包水瓶改回3~~
- ~~晒肉架 去掉木炭~~
- ~~加：鱿鱼掉肉~~
- ~~跳跃体力消耗改为1%，攻击2%，挖矿掉快3倍~~
- ~~删除：不新鲜掉1%san~~
- x~~肉干2天晒干~~
- x~~再加长攻击距离~~
- ~~攻击减体力2.5%，跳跃0.4%，跑跳扣除减少~~
- ~~睡醒0饥渴debug 多人模式 statAccessor~~
- ~~灵魂受损优化~~
    - ~~图标丑~~
    - x~~和其他debuff如潮湿交换闪~~
    - ~~死一次涨一级，但一次消~~



- ~~低san恢复，多人模式还在响~~
    - ~~翻译regen改regeneration以免其它语言机翻出问题~~
- ~~ServerPlayerEvents.AFTER~~~~\_RESPAWN alive问题 末地返回不会灵魂受损，但san恢复 - debug：末地返回视为重生，重置状态~~
- ~随机从树叶掉下水果
- ~~潮湿惩罚：离开水掉San（减速删掉）~~



- ~~debug：热水袋放进冰箱，突然冰冷 ~~`getExp ifn return Long.MAX_VALUE`
- ~~跑步掉耐力太慢~~
- ~~打湿1、2级与潮湿程度反过来了~~
- ~~增加放置方块距离（太长力，再改）~~
- ~~shift延长攻击距离，但对徒手无效~~



- ~~把到后面饿得慢改成饿得掉血很慢？~~
- √~~羊毛原版不能缓冲？~~
- ~~debug：打湿+淋雨不掉san~~
- ~~草、沙子方块摔落缓冲~~
- ~~体力\<30%跳跃不掉反增体力~~
- ~~僵尸视距调48~~
- ~~靠近热源体温增加太慢？+改慢一点~~



- ~~体力不支不能跳~~
- 根本没有~~debug：泡水降温重复两次（第一次getFeelingTemp-isWet 第二次HcsEffects.WET）~~
- ~~过热浇湿改为不顶用（当温度\>1.5（现实中约50℃）时）~~
- ~~debug：游泳间歇性掉san~~
- ~~砂土受重力影响~~
- ~~创造模式不会锁定挖掘~~
    - x~~锁定挖掘的方块必须是同一种~~



- ~~僵尸攻击玩家和攻击动物的优先级相等~~
- ~~item.tool material重写 改为枚举类~~
- ~~降低铜铁工具耐久~~



- ~~铜矿、铁 挖一个只掉一个，除非时运~~
- x~~bugtest：走在灵魂沙/耕地上是否掉san？~~
- ~~锥挖砂砾仍然很慢+重新启用木铲~~
    - 
    - ~~燧石锥提示：挖沙砾有限，推荐木铲子~~
- ~~削弱金坷垃（浇多了烧死 冒烟粒子 加tooltip避坑）~~x解决新思路：使用全局数据存储（用耕地）
- ~~稍微削弱木铲子挖掘速度50%（rate/1.5）~~
- x~~燧石锹~~
- ~~小麦合成小麦种子~~
- ~~deug：木制工具能砍树~~
- x~~debug：时运无效（只是效果不好）~~
- x已~~optimize：打制概率？~~



- ~~debug：Cannot set property IntProperty~~
- x~~减慢铜铁工具开采速度~~



- ~~optimize：玩家在僵尸16格内强制被当做攻击对象~~
    - ~~启示：~~**Mixin尽量修改父类**~~，修改子类而需要调用父类的成员则可能有覆盖子类的风险/无法调用父类的方法~~
- x~~锋利断骨也能合成~~
- ~~debug：作物stage1收割不会不新鲜~~
- ~~optimize：石锥挖掘速度太慢~~
- ~~debug：急迫对自定义挖掘速度的方块效果不好~~
- ~~debug：用副手垫高高工具距离不够~~
- ~~测试：canBreak~~
- x~~一阶作物halvefreshness改为啥也不掉~~
- ~~锄头挖作物加速~~
- ~~一个骨头只能合成一个骨粉~~
- ~~debug：腐烂食物不显示枯萎警告x——削弱腐烂食物，不能催熟~~
- ~~降低木棍和骨头攻击怪物断掉的概率~~
- ~~疼痛名称查看痛度表（视频）~~
- x~~debug：木棍断掉不会扣除~~
- ~~HcsDebuffs降低击退能力、挖掘速度~~
- ~~灵魂受损改为5次机会~~
- ~~疼痛和受伤debuff名称显示修正~~
- ~~debug：狼牙棒攻击距离~~
- ~~受重伤debuff~~
- ~~I. hurt降低移速10%，攻速10%，击退力20%~~
    - ~~II. injured降低移速30%，攻速30%，攻击力20%，击退力40%~~
    - ~~III. crippled降低移速40%，攻速60%，攻击力50%，击退力60%~~
    - ~~IV. dying降低移速80%，攻速80%，无攻击力，击退力80%~~
        - ~~添加：dying跳不起来~~



- ~~疼痛~~
    - ~~受伤&疼痛.description~~
        - ~~疼痛保存到数据中~~
    - ~~debug：~~
        - ~~PainManager: Val is NaN~~
        - ~~疼痛逐渐加剧而非消退（重生后）~~
        - ~~湿度不再显示UI S2C给C失败，没接收~~
        - ~~受伤不疼~~
        - ~~树皮7天腐烂~~
        - ~~创造模式仍然掉落树皮~~
    - ~~树皮显示和语言问题~~
    - ~~树皮的性质测试~~
    - ~~止痛药？~~[阿司匹林](https://mp.weixin.qq.com/s?__biz=MzA3NzU3OTg0Mg==&mid=2247486467&idx=1&sn=918c4cc4d76a81fdae1a0343d5b85b5f&chksm=9f4e9f2ea83916385bda0fbc2ad34e013df4590897522f409d75aa58b9120478f79d7bbbcb56&scene=27)
        - ~~树皮~~
        - ~~柳树树皮（水边木头去皮有概率活得）直接吃vs熬止痛剂~~
            - ~~其他止痛：九死还魂草、金苹果~~
        - ~~有nbt标签是之前的树皮存在保质期bug导致的~~
        - ~~树皮应该掉进玩家背包内合理~~
        - ~~小刀右键也能剥皮~~
    - ~~护甲削弱疼痛~~
    - ~~alle cache保存问题 setRaw 而非 setReal~~
    - ~~~~[血药浓度－时间曲线（药时曲线）](https://www.med66.com/chujizhuguanyaoshi/fudaojinghua/ga2004291574.shtml)[血药浓度－时间曲线（药时曲线）](https://www.med66.com/chujizhuguanyaoshi/fudaojinghua/ga2004291574.shtml)
- 	~~刚被打就极度疼痛~~
    - ~~吃撑会肚子疼（同时吃撑影响减弱）~~
    - ~~painManager必须要set写出两个函数，否则不好办~~
    - ~~疼痛Client端正常，Server端异常 不显示~~
    - ~~optimize：轻微疼痛仍然能睡~~
    - ~~疼痛受伤debuff忘了加挖掘速度减慢~~
    - ~~平衡疼痛和受伤debuff带来的削弱效果~~
        - ~~bug！！！疼痛削弱太大！~~
    - ~~灼烧痛感翻倍~~
    - ~~alle=0.0878 t=2400？~~
    - ~~止痛后raw变为4~~
    - ~~止痛持续效果不太好，建议能压制一段时间的疼痛~~
    - ~~耕地附近有水的轮子不好用（~~`FarmLandBlock.isWaterNearby()`~~）~~
    - ~~开局8血改为12~~
    - ~~bypass armor对浆果丛无效，对中毒有效~~
    - x~~疼痛玩家音效~~
    - ~~percent 当血\<12时maxHealth参考值为12~~
    - 并不会~~生命值限制导致的伤害会产生疼痛吗？~~
    - ~~睡觉减少疼痛、止痛失效~~



- ~~初始12点血~~
- ~~疼痛改unmanageable pain~~
- ~~查理~~
    - ~~death.attack（目前仅限黑暗密闭空间 xxx was consumed吞噬×吞没✓ by darkness）~~
    - ~~提示：~~
        - ~~伸手不见五指，黑暗中好像有什么东西要吃掉你~~
        - ~~debuff：被黑暗笼罩darkness enveloped 怪异的声音与视角拉长~~
            - ~~x被监视的debuff？√黑底白轮廓，面目狰狞~~
        - ~~那个声音越来越近了...~~
        - ~~3S后那个声音消失了，暂时...~~
        - ~~疯狂掉san，掉光送走~~
        - ×~~任意高度完全密闭不透光空间都缺氧~~
        - ~~jump scare+x小黑发怒声音~~
    - ~~满级恐惧绑定（3s后）~~
- ~~重做jumpscare，加上红眼睛~~
    - ×~~optimize：血丝后面渲染，不要被黑暗覆盖掉？~~
- ~~debug：没san死亡渲染幻觉实体导致空指针异常~~
- ~~不要删删掉罢！算了 留作屎山x突脸音效非常响~~
- ~~恐慌改进~~
    - ~~一只怪不怕，多了就怕，还额外掉san，相比之下之前的一只怪掉san没那么严重~~
        - ~~panicAnticipated→currPanicLvl 0.5×附件怪数量~~
    - ~~恐慌效果实装：微削攻击力、减少命中率（×其削弱也与距离有关）~~
    - ~~恐慌随所达最高等级的增加而递减~~
    - ~~×β阻断剂：僵尸掉落 √无畏草~~[具有安神效用的植物/中草药](https://baike.baidu.com/starmap/view?nodeId=f0f8db414ae68bfe25d3d50e&lemmaTitle=%E6%9C%B1%E7%A0%82&lemmaId=16565416&starMapFrom=lemma_starMap&fromModule=lemma_starMap)
    - ~~[STDOUT]: 0.0 0.0 0.0 0.0~~
    - ~~optimize：见怪掉san速率由恐慌定~~
    - ~~debug：测试在黑暗中、不同等级恐慌、maxExpLvlReached、nbt保存、嗑药~~
- ~~debug：吃撑走路非常慢~~
- ~~debug：黑暗恐慌未拉满~~
- ~~optimize：打草概率问题 rand分布更接近0?~~



- ~~流血~~
    - ~~lv1.暂停回血 lv2.缓慢损失生命 lv3.较快 lv4.很快~~
    - ~~缓慢自行止血~~
    - ~~测试BiFunc是否有误~~
    - ~~debug：流血伤害不生效 忘了canApplyUpdateEffect~~
    - ~~debug：流血不是由单次受伤量而是时间段内的受伤量判定（那其实bleeding可以为负的，每次受伤都会加？）~~
    - ~~optimize：止血、恐慌衰减速度太快；严重出血及以上不能自行止血~~
    - ~~optimize：惊慌击中率太低~~
    - ~~打绷带要时间 参考food item~~
    - ~~简易绷带：草纤维×3+绳×1 × 30%成功率~~
    - ~~绷带~~
    - ~~吃金苹果可以止血~~
    - ~~optimize：太不容易流血了~~
    - ~~盔甲抑制失血~~
    - ~~debug：仙人掌、浆果丛无法导致流血~~
    - ~~debug：创造模式仍然有疼痛提示音~~
    - ~~疼痛音效~~
    - ~~debug：绷带无法使用~~
    - ~~optimize：带疼痛跳跃增加耐力消耗~~
    - ~~debug：疼痛不能设置重生点~~
    - ~~optimize：shore饮水是咸水println~~
    - ~~optimize：中暑整个视野的色调都要变 叠加一个橙色图~~



- ~~使用绷带音效：使用s2c发出播放羊毛放置音效的请求 其实serverPlayer.playSound自己就能解决~~
- ~~crafting的notify没有用~~
- ~~绷带贴图改进：开局送~~
- ~~骨折~~
    - ~~目前是高处摔落获得~~
    - ~~需要夹板~~[splint](https://pzwiki.net/wiki/Splint "Splint")
    - ~~吃金苹果可以恢复~~
    - ~~optimize：SpiderGlandItem extends BandageItem~~
    - ~~debug：名称不要~~`GET_AMP3_KEY`
- ~~寄生虫感染~~
    - ~~伤害类型~~
    - ~~目前是喝生水0.5%、吃生肉5%（猪肉额外）、吃动物内脏10%概率得到~~
    - ~~三个阶段：早（水食+50%）、中（疼痛，水食+100%）、晚（疼痛、水食+100%、失明、掉血）~~
    - ~~南瓜子治疗（需要吃多个）~~
    - ~~吃金苹果可以恢复~~
    - ~~翻译地道：hold the right mouse button; can apply a bandage to a wound.~~
    - ~~handleFallDamage damPercent\>0.5&&fallHeight\>9~~
- ~~感冒~~
    - ~~长时间在水中或雨中触发~~
    - ~~淋湿掉san改为感冒（同时.description也要改）~~
    - ~~吃金苹果可以恢复~~
    - ~~治疗：生姜（打草获得，采取联动，即name.contains("ginger")）~~
    - ~~废除潮湿UI显示，改为buff~~
    - ~~感冒的负面作用~~
- ~~负重~~
    - ~~目前是背包内两组以上方块~~
    - ~~移动×全部✓消耗的耐力额外+25%（力量药水免疫）~~



- ~~空手挖稍微硬方块受伤 先疼 再流血 还有警告~~
- ~~空手攻击也会~~
- ~~忧郁~~
    - ~~目前只有一级？~~
    - ~~San连续半天保持低水平（\<50%）触发~~
    - ~~增加：san保持较高水平~~
    - ×~~san掉光 ×恐惧感拉满 随机被未知生物伤害，同时屏幕白闪（被黑暗笼罩时禁用受伤&闪）~~
    - ~~san掉光限制能见度~~
    - ~~回血-25%、挖掘速度-20%（目前）~~
    - ~~rewrite the machine translation result to idiomatic expression:~~
- ~~前期简易装备：木板材质~~
    - ~~木头护甲 防御\>皮革 耐久\<皮革~~
    - ~~劣质×简易√~~[木盾](https://www.mcmod.cn/class/5387.html)~~（10点耐久） ~~~~~~[fabricshieldlib](https://fabricmc.net/wiki/tutorial:shield)
    - ~~合成~~
    - ~~debug：盾牌耐久也不掉~~
    - ~~debug：模型问题、语言~~
- ~~生物微调~~
    - ~~加强恶魂（爆炸规模→伤害、击退）~~
    - ~~僵尸猪人看眼睛会激怒~~
    - ~~鸡掉羽毛（跟生蛋一样）~~
    - ~~optimize：动物跑太快（如牛）~~
- ~~tooltip删除ItemWithTooltip，改用ItemMixin的appendTooltip，if(x.description≠x.key)~~
- ~~debug：剑不能灭火~~
- ~~刀打草加快 耐久更难掉~~
- ~~石头击打有额外伤害，也会破损~~
- ~~没san睡不了觉：阴森诡谲的幻象充斥（overwhelm）于你的脑海中，你已然彻底癫狂，更何谈入睡~~





- ~~燧石碎片做狼牙棒~~
- ~~靠近岩浆额外体温上升速率~~
- x~~前小后期提高燧石爆率 有木块→方块~~
- x~~默认熔炉烤肉30，而我的是20~~
- ~~debug: HcsDebuffs 顺序不要闪！尤其是带着debuffs退出重进 LivingEntityMixin/getStatusEffects~~
- ~~debug：铜工具耐久条显示异常（不是bug，耐久为负是这样的）~~
- ~~debug：兔肉掉落异常~~
- ~~debug：扩大箱子可以撬开（property转nbt）~~
    - ~~直接旁边有无naturallyGen的，如果有那place的时候也要撬开~~
- ~~有条件生成村庄~~
    - ~~天数，获得镐（世界状态）~~
    - ~~生成死村~~
        - x~~debug：自然生成的村民统统删除 bug：偶尔正常生成村庄 如超平坦、沙漠村庄~~
    - x~~村庄熔炉有现成的？~~
    - ~~测试：获得镐的数据读写~~
    - ~~/village查询能否生成村庄~~
    - ~~debug：locate指令卡服~~
- x~~心脑血管疾病 or改and?~~
- 是~~world不同的维度的时间是否相等~~
- ~~开始消息提示显示版本号~~
- ~~再叫老九测试一下~~
- ~~潮湿不满 恐慌不满~~
- ~debuffs还在闪
- ~~黏土挖得慢 铜锹~~
    - ~~isShovminable→not, add isShovminable=isShovminable||block==Blocks.CLAY~~
- x~~举盾流血~~
- ~~多语言~~
    - ~~繁体港台&梗体（一式三份）+机翻~~
    - ~~~~[语言参考](https://github.com/Glitchfiend/ToughAsNails/tree/TAN-public/src/main/resources/assets/toughasnails/lang)[语言参考](https://github.com/Glitchfiend/ToughAsNails/tree/TAN-public/src/main/resources/assets/toughasnails/lang)
- ~~每进入世界5次提示打赏（包括官网、百科和github页面）~~
    - [https://www.paypal.com/paypalme/](https://www.paypal.com/paypalme/)
    - [https://www.buymeacoffee.com/](https://www.buymeacoffee.com/)
    - [https://afdian.net/](https://afdian.net/)
- ~~打赏提示无效？疑似packet没到~~
- ~~base64直接改本地图片~~
- ~~赞助页面分语言？~~
- x~~在留言板反馈~~
- ~~返回顶部删除？爱发电？阻止嵌入代码？~~
- 【技巧】~~MC百科插入HTML←markdown ~~[https://bbs.mcmod.cn/thread-1139-1-1.html](https://bbs.mcmod.cn/thread-1139-1-1.html)
- ~~两处debug复原之前的css和HTML~~
- ~~remove ads bodyonbload× 结尾div隐藏√~~
- ~~banner加上模组图标~~
- mcmod图标加上白色描边
- ~~开始宣传，先做百科~~
    - [https://www.mcmod.cn/class/8716.html](https://www.mcmod.cn/class/8716.html)
- x~~官网随处可见的赞助~~
- 手机上加载不出官网的背景
- [https://legacy.curseforge.com/account/connected-accounts](https://legacy.curseforge.com/account/connected-accounts)
- ×~~github添加release~~
- ×~~github库插入star统计~~
- ~~github readme插入主要内容~~
- ~~模组标签：抖M 写实 真实 MITE 环境 难度 饮水 体温~~
- ~~赞助：感谢名单~~
- 保姆级安装教程
- 前置：fabric api
- github youtube B站：@凝雨菌
- 重置：游戏
- 描述加上**其他mod的灵感**
- 更换封面 mcmod上的不够突出
- 官网考虑百度图床加速？（仅限背景）
- 官网页脚的【鸣谢】
- 网站做个留言板！lol
- ~~注意：如非特殊原因，20元（3$）以下打赏恕不退还！~~
- ~~构思头像~~
- 录音声音偏小
- [https://www.mcmod.cn/donate/](https://www.mcmod.cn/donate/)
- 在超平坦封闭空间拆火把降氧气原因：地板是草方块，不能进行光合作用
- [https://legacy.curseforge.com/minecraft/mc-mods/hardcore-survival](https://legacy.curseforge.com/minecraft/mc-mods/hardcore-survival)

> 出了视频再说：7年以来的梦想终于实现了！！
> 2万行代码把mc改成了硬核游戏（符合EULA用户协议）
> 注：大部分内容都是基于修改和添加游戏底层代码来实现的，所以难度较大。
> 1. 写这一万多行代码需要研究至少几十万行游戏反编译代码
> 2. 一个小小的修改都可能导致屎山出现微妙的bug乃至蝴蝶/雪崩效应，这种情况则需要重新构思
> 3. 还要考虑模组之间的兼容性、跨版本的兼容性等
> 把这个视频转发给你身边喜欢xx的朋友
> 不要问我一个游戏为什么能玩十年，mc玩家就是这样的，怎么了
> 
> 独自一人，坚持数年，无偿创作MC硬核生存mod，你真的不忍心赏几毛钱吗（可怜兮兮）
> 硬核生存mod是一款我的世界的模组，是集MC史上绝无仅有、相当炸裂的模组；是集大成者，集完全转换（如MITE、BTW）、生存要素（如口渴、温度、医疗、营养）、多种硬核生存游戏的精华、作者的灵感于一体。对于硬核玩家和生存狂来说，错过后悔！
> [https://afdian.net/a/frozenrain](https://afdian.net/a/frozenrain)
> 
> prev: A Minecraft mod brings incredibly realistic and tough survival experience with ambitious playing goals.
> 
> This is your %1$s time(s) using hardcore survival mod to enter this world! The author has worked alone voluntarily for years to accomplish the mod without any payment. Could you please spare a few cents?(pitiful) It means a lot to me, thanks! Sponsor link:
> 
> Working alone voluntarily for years to create the hardcore survival mod for Minecraft without any payment. Could you plz spare a few cents?(pitiful)
> 
> PS: Hardcore survival mod is an unprecedented  mod in the MC modding history. It's a culmination of various elements like complete transformation (e.g., MITE, BTW), survival factors (such as thirst, temperature, healthcare, nutrition), essence of diversified hardcore survival games, and the author's inspiration. For hardcore players and survival enthusiasts, you'd regret missing out!
> 
> 名称：rain's hardcore survival
> 
> give me a coffee用不了，没有非大陆手机号

Ok, after playing around 4/5h with this mod I can tell it achieves what it wanted to achieve - increased difficulty, there are few stuff that are more tedious/annoying than hard, like getting flint or copper, not only both of these have incredibly low chance of dropping, they also may not be used at all, for example flint can break during sharpening so hour of grinding (it sometimes felt like an hour tbh) just went to trash, similar story with copper, let's say you finally got to point of acquiring single copper ingot, so you craft it into shovel to speed up the process of getting more only for it to break before getting any, because chance of getting it is slim, not mentioning available at the beginning stages tools are trash so mining gravel is hell, really most of my days I was spending on mining gravel, plus the sudden jump to upgrade, it would be a good idea to have early version of chest, crafting, bed n such to make it feel even more like a progression climbing.



Other thing that could be possibly annoying is spawning in specific biome, like badlands which was one of my first places, it's annoying because you can't get grass nor rock, personally I think you should at least add compatibility with few mods that also focus on early stages (like "Primal Stages" or "No Tree Punching") to get things like rocks on ground or primitive work stations, which seems like bit easier solution than adding specific features yourself.



So other than that, the mod is amazing, I love the hud implementation, sanity and mood is just amazing and super original, I feel like addition of new food was bit unnecessary, all it does is add incompatibility for other mods adding food n such, but generally speaking I enjoyed playing with this mod, to the point I wanted to add more survival enhancing mod (like "True Darkness" or "Hardcore Torches") to achieve even more of a realistic experience, regardless I have high hopes for this mod, it really is amazing and I'm loving it so far, can't wait for what is yet to come. :)



#### B站视频

标题：独自脑瘫439天整出的mod！比MITE还离谱的硬核生存？超真实困难！

封面n厨狂喜！

简介：把这个视频转发给身边所有喜欢mc的朋友！

承诺会支持1.20！





### 医疗

- ~~寄生虫、感冒~~
- ×~~肠胃炎（腹泻plus？）：无食欲、呕吐（新debuff）、腹泻、困倦~~
- ~~debuff：重伤（创可贴图标）（x创可贴流血图标）、骨折~~
- ~~流血：轻微无法再生生命 重：缓慢损失生命~~
- 伤口感染
- [健康&疾病](https://www.mcmod.cn/class/12300.html)
- ~~疼痛debuff~~
    - ~~optimize：吃撑了不能继续吃，肚子疼，减速~~
    - 肌肉酸痛（过度运动）
    - 关节扭伤
- 骨折：后面优化考虑夹板固定之后仍然有debuff
- 急救系统：可以只有两个流血程度（轻度不回血，重度掉血，绷带止血）
- 红肉可以补脂肪
- 伤口沾水诱发感染
- 蛆虫治疗感染伤口 腐肉可以分解蛆
- 蜂蜜绷带
- 身体部位生命：参考 [1](https://www.mcmod.cn/class/916.html)  [2](https://github.com/SrGnis/Body-Health-System) fabric没有，建议mod添加
    - 我之前玩自己的整合包不小心踩到了火，按理来说只有脚会烧伤，为什么头的血量也掉了QQ酱61527QQ酱61527Lv.1很正常，仙人掌方块啥的随机判定的伤害，好像只有弓是准的，近战也不一定准
- 手臂骨折了(在不使用工具的前提下挖掘高硬度方块)
- 疲惫
- 开心
- 焦虑
- 参考：[https://www.mcmod.cn/item/455534.html](https://www.mcmod.cn/item/455534.html)
- 晒伤
- 内伤？



### 体重

- 饥饿为0不会马上掉血，体重先疯掉（2个↓）
- 吃饱了可以继续吃，直到吃撑
- 参考JEI，背包UI不显示小绿书时侧栏显示



### 心情&专注





## 发布和宣传



发布第一个公测版本：食物、温度、体力、San、营养、氧气、湿度出了就发，不需要boss

版本号有两种表示，一个是正规的，另一个是R简化的版本。**要写更新日志了**

- 邮箱：注册网易or使用谷歌，免得qq邮箱经常闪来闪去被骚扰
- 官网
    - 工具：删除UE，[换FTP](https://filezilla-project.org/)或直接用vscode ftp
    - 网站logo从64×64到128×128+，不然图标不能完全填充谷歌浏览器空缺
    - 页面优化，图标做大，*要有主页*
    - 考虑换域名？（感觉没必要）
    - 根据语言/地区自动跳转页面
    - 生成robots.txt文件 排除baidupic.html
    - *制作宣传海报*
    - *教程*
    - ~~github repo~~
        - ~~协议：Apache~~[CC4.0？？？ ](https://github.com/WayofTime/BloodMagic/blob/1.18.2/LICENSE？？)
        - ~~改协议？？~~
- 宣传&建设
    - 优先三点
        - Mcmod
            - 含有硬广型的站外引导性内容，例如提供了站外链接，但未提供完整的介绍、含有“具体玩法请到XX查看”等。
            - 含有“PS.”、“PSS.”、“注”等前后缀，正常介绍应融入正文，避免多个注解的叠加。
            - (**FIX ME!**)Click [here] to view *Chinese version* and wiki
            - 在别的mod评论区下留言 可以看看我的mod mcmod modrinth curse forge
        - Modrinth（注意抠搜索关键词）、cursed forge
        - [Join Modrinth: let’s redefine modding for games!]([https://modrinth.notion.site/Join-Modrinth-let-s-redefine-modding-for-games-2f8e1ebb423a456980d25e24f2747a96](https://modrinth.notion.site/Join-Modrinth-let-s-redefine-modding-for-games-2f8e1ebb423a456980d25e24f2747a96))
        - 官网
            - 让百度、搜狗、谷歌、必应搜索能搜到
    - 错误反馈：github repo issues / email 聊天栏？版本号？（注：bug及反馈页面也要在mcmod百科中提供链接）
    - 看官网是否能在国外正常访问
    - 版本发布（看宣传）
        - CurseForge（包括类似模组底下）
        - Mcmod（包括类似模组底下）`当年Environmine中二内容重新编辑`
        - Modrinth
            - 谷歌搜索引擎
            - mcbbs
        - [https://www.9minecraft.net/](https://www.9minecraft.net/)
        - *Github releases*
            - Github README.md放中文版（参考MITE-ITE）
        - [minecraftforum](https://www.minecraftforum.net/)（Plz help me to spread the mod in any way u want!）
    - 添加官方论坛
    - 江鹏帮忙挂梯子宣传：youtube、google引擎
    - 做完了在基地群里发
    - 等beta迭代几个版本后再求籽岷宣传？
- 让简玩试试 upup有兴趣试一下我做的这款mod吗 也是受mite启发 我是你老粉了 也是mite玩家 不强求

[灵感 mite reborn](https://yuezhuxue.gitee.io/mite/ga/miteReborn.html)

- [目前没有“硬核生存”](https://www.curseforge.com/minecraft/modpacks/hardcore-survival-pack-met-mods)这个mod的名字（有两个整合包 [1](https://search.mcmod.cn/s?key=%E7%A1%AC%E6%A0%B8%E7%94%9F%E5%AD%98) [2](https://www.curseforge.com/minecraft/modpacks/search?search=hardcore+survival)）
    - 官网：icon改成燧石斧或mod logo，将反馈调前
    - 官网wiki
        - 页脚插入[CC BY-NC](https://creativecommons.org)
    - 官网首页：哔哩哔哩 3分钟入门MC硬核生存mod！ → 作为up可以出一期 入门必看！僵毁真大灾变最全技巧！
        - 不看后悔！僵毁真大灾变保姆级攻略，新手也能玩！
    - 官网图片加载过慢，甚至要16s，快6s 有时候banner（尽管30kb）干脆加载不出来
    - 官网：
    - Mod百科：在其他相似mod评论区发
    - Mod欢迎语：加上mcmod的网页链接
    - 赞助：afdian.net、give me a coffee 网站
        - nbt统计：您已经是第五次进入这个世界了，喜欢的话可以考虑赞助作者！哪怕几毛钱都行！谢谢！独自一人无偿开发数年真的不容易（可怜巴巴）
    - 反馈：检查[mc1mc@qq.com](mailto:mc1mc@qq.com)是否有效
    - **懒人包不能做！侵权违法！详见EULA**
    - fabric模组也能发在curseforge上
    - 在Enviromine、TAN、生存要素（survive）页面（百科、curseforge）上宣传
    - bug反馈：邮箱、[issues](https://github.com/user/repoName/issues)
    - 基地、银河的群、MCPE讨论群、艾诺德、何一帆
    - 翻墙
        - 赞助页面&Mod提示：由于~~高校~~禁止访问部分外国网站，如果喜欢请帮忙在Google、Facebook、Twitter、Youtube、其他论坛以及其他任何国际性或地方性的互联网平台上转载，无需申请批准，可以告知作者by email，It will be heartly appreciated！
        - www.minecraftforum.net
        - curseforge、modrinth.com
        - 撰文：以hmcl为例安装本mod+fabric如何安装光影？添加奶碗（营养，不杀生）木甲（一次性做3个）向全网征集：帮助翻译、移植forge版本
    - 宣传片30s：多个p
        - [标题党](https://www.jianshu.com/p/9e57246ebae5)
        - p1：更多的状态
        - p2：类似MITE的开采
        - p3：更长的游戏主线（TR：？？）
        - p4：更多生物和物品
        - p5：你值得拥有
    - 实况教学（剪辑）
    - mcbbs、外国论坛、贴吧、b站、抖音
        - 嫌mc不真实？mite太坑？这个刚刚好！一个人耗时一年做的硬核生存mod！
    - 视频bgm没必要，或安静的
    - 籽岷
        - *自制介绍地图，更方便*
        - 岷叔您好，我想请您帮我介绍一个mod 给钱
        - 名称：类型：版本：链接：mcmod
        - 我是这个mod的作者，我希望这个优秀的mod能被更多人发现，以此来丰富MC的生态圈，所以有求于您
        - 只需按照链接里面简介的内容大致过一遍就行，不需要太详细，因为我并不想占用您太多的时间
        - ~~您是想选择近几天拨冗介绍一下，还是想过一段时间之后再介绍？~~~~希望您能看在十年老粉的面上，给我一个简单的答复。我尊重您的选择。~~
        - 很抱歉打乱了您的计划，再次表示衷心的感谢！
- 兼容性
    - 日常划水，发现有很多mod已经包含我的计划了，而且也兼容高版本fabric，所以可以不选择做大型mod，而是中型，搞好兼容就行
    - &nbsp;毕竟一个人时间精力有限，别的中型以上mod都是一个团队开发，而且做mod也枯燥
    - 考虑公测版本过后的兼容列表：农夫乐事 工业时代2 植物魔法FabricSeasons（有点答辩，实在不行我考虑做个季节，而且很想秋季开局）
    - 新手友好化
        - 一定要有匠心，顾及玩家体验（反面教材：征服大地、MITE）
            - 减少机械重复或等待、被虐(eg.合成要时间、挖掘太慢、背包容量限制)
            - 新手补给包：水、~~火把~~、食物、恒温药水、石锥（防掉坑）、~~枕头~~
    - 自由配置各功能是否启用
        - eg食物不变质、冰箱永鲜
    - 与TAN、EnvironmentZ、征服大地、群峦加载时提示
    - 多人模式
- [爱发电如何吸引粉丝订阅？]([https://afdian.net/album/248b4bb2c9b111e9a9bb52540025c377/2da755247a8911e8ad6d52540025c377](https://afdian.net/album/248b4bb2c9b111e9a9bb52540025c377/2da755247a8911e8ad6d52540025c377))
- mod要注明灵感来源
    - inspiration partly comes from:
    - §mTerraria§,§mDon't Starve§,Enviromine,Tough as Nail,Minecraft is Too Easy,TerraFirmaCraft,etc
- 后面网站加入广告？统计浏览量[https://www.wpbeginner.com/plugins/how-to-add-a-stats-dashboard-on-your-wordpress-site/](https://www.wpbeginner.com/plugins/how-to-add-a-stats-dashboard-on-your-wordpress-site/)
- 官网收录？[https://seo.chinaz.com/hcs.coolpage.biz](https://seo.chinaz.com/hcs.coolpage.biz)



## 荒野更新

### 润色1

- 镐子挖竹子太慢了！
- 力量药水的心新配方？？？
- **1.19.2 1.20.1 config/轻量版**
- 20rmb mod 什么时候出外伤内伤心理疾病
- debug：地狱岩可以徒手挖
- 打蕨类也会掉东西
- 失温太容易感冒
- 晚上掉san太厉害了？是不是没有光源16%每晚，减掉一些
- 血月？ 
- debug：动物濒死没打死可能掉内脏
- 记得更新死村nbt
- WorldHelper.getWorld改为minecraftServer.getWorld(World.OVERWORLD)
- 野菜做料理
- 水碗
- 种子汤（稀粥）
- 过热出汗，湿度上升，到20%，但不超过30%（绝对抗热）
- 用代码删掉有价值的loottable？
- EntityHelper.dropItem部分替换为enity.dropItem
- ~~×吃糖回体力~~
- 如果不影响大可不必Interface Injection??? [https://fabricmc.net/wiki/tutorial:interface\_injection](https://fabricmc.net/wiki/tutorial:interface_injection)
- github主页[https://github.com/anuraghazra/github-readme-stats](https://github.com/anuraghazra/github-readme-stats)
- 流血穿合金甲可以抵御，也可以喝药水
- 牛反抗：被踢
- 感冒咳嗽打喷嚏的音效以及吸引怪物
- 浅活水饮水似乎有问题
- UI显示温度即将变成的趋势
- 矛可以投出（继承三叉戟）`@Overridepublic UseAction getUseAction(ItemStack stack) {return UseAction.CROSSBOW;}`
- optimize：攻击能降低恐慌
- 没san别再附加恐慌，免得回不了了
- 根据json的tag用json替代原本的一些高度自定义的合成配方
- 绷带能加快伤口恢复、一定程度上止痛
- 参考BTW：不能跳垫方块
- optimize：蜘蛛远距离吐丝
- debug! HcsDebuffs多了排列顺序闪来闪去
- [研碎的罂粟种子](https://m.baidu.com/bh/m/detail/ylchm_7567050131514669934)
- optimize：伤害吸收抵消疼痛？
- 受伤疼痛感冒等音效
- HcsDebuff icons 显示程度
- 石头可捡
- 喝生水得寄生虫（致命）
- 柳树皮炼制止痛药水（完全止痛），无畏草炼制无畏药水（完全压制恐慌，时间更长）
- 疼痛玩家音效（PlayerEntityMixin/ticks不行）
- 扔出去的石头造成的伤害与速度成正比
- 幻觉下的怪物具有攻击性（但杀死会回san）
- 皮革防水最好
- 阿司匹林和酒不能同时吃
- 饥渴debuff细化为四级、包括体力
- 蜘蛛腺合成更好的物品
- 咂矿掉经验
- 改logo：平铺，图标大
- 将撸草掉落的放到blockmixin/get dropped stack内
- 少用api json数据格式 改底层代码
- 分离小插件：挖掘锁定
- 验证铁铲僵尸挖得快？
- 升级到1.20.1??[【Fabric和Forge模组共存支持！1.20.1全新兼容模组信雅互联（Sinytra Connector）介绍-哔哩哔哩】](https://b23.tv/DCYGE5y)
- 铁铲僵尸挖得动圆石（删？？）
- 土 火把 土 挖掉下面的土上面的悬空（删掉？？）
- 有时候锁定挖掘解锁没反应（右键）
- [盔甲优化](https://www.mcmod.cn/class/8716.html)盔甲内衬
- 物品掉落保存时间延长
- debug：晒肉架右键一次取下仍然显示
- 合成配方解锁提示 参考暮色森林
- 随着时间推移怪物变强
- 洞穴特殊怪
- 弹弓
- x筛网 xx木铲子挖得更快/筛掉-动画 燧石锥很快 耐久提高
- Z键缩放
- 疼痛
    - 特效：视野变红变黑
    - 无法入睡
    - 失明
    - 惨叫声
- 加大矛的模型
- debug：有时候取消挖掘锁定失灵
- 检查更新（获取modrinth网页源码）
- 对照着[MITE百科](https://www.mcmod.cn/class/226.html)调整mod内容
    - 蜘蛛残血逃跑
    - [MITE中你可能不知道的冷知识](https://www.mcmod.cn/post/3059.html)
- 黑死（密闭、新月）&月相影响亮度和掉San速率
- 喝生水概率腹泻 寄生虫
- 无床重生1w格内随机点
- 趣味性\>挑战性？把背包限制在（其实可以局限于双手，然后手搓背包 **修改负重debuff系统**）露在外面的一栏，而且每一格只能放一个东西（模仿征服大地+后期科技可以背包扩容）
    - 难度肯定比mite高的，但是这种为了难而难的东西根本不适合大多数人玩，除非真的想挑战不然不建议尝试，看看视频得了，就像真人野外求生一样，看看得了，很折磨人的
    - 就目前而言我感觉这个可玩性更高，贝爷生存前期我感觉纯纯恶心人，太TM坐牢了，概率直接逼死部分人（比如我）**mite就是增加难度恶心人的，Minecraft is too easy，但确实是上瘾，玩习惯mite其他模组不联机就很无聊**
- 重写饥渴机制？像debuff一样？× 单纯去除百分比？如非常渴/脱水 数值减少代入感（可以有config启用经典UI）
- 等级（经验换取，可以选择加血量）
- 火把&篝火熄灭（而且不能再次被点燃？？有耐久 参考比狼好+火把亮度降低） 手持/背包有耐久 红石火把、红石灯 萤石火把
- 优先config
    - [参考](https://www.mcmod.cn/class/5387.html)
    - 包括debuff是否在右上角显示
- 深板岩只能用钻石+的镐挖
- 降低小麦种子掉率或干脆不掉
- 小史莱姆有伤害
- 参考MITE源码重写AI`public class EntityAIWatchAnimal extends ps {` `public class EntityAISeekWaterIfThirsty extends EntityAIMovementTask {`（见`versions/xx.jar`）
- MITE工作台等级？（蓝图可以代替一些？）
- `SINE_TABLE`：Math.sin/cos相关代码优化
- 对照着MITE百科调整mod内容
- 添加[净水器](https://b23.tv/balBIHA)（杀哥灵感），原版是脏水
- 参考MITE-ITF算法：季节+冬季自动补雪
- 不在加载区块作物照样长（参考MITE）
- 花瓣沙拉改蒲公英，加强？
    - 模仿僵毁，可以往沙拉里加各种配料
- **模仿僵毁的烹饪系统（支持加一切食材） 做口锅**
    - nbt
    - 加食材直接合成
    - 可以炒饭
    - 额外回san
- 来狗+警告
- 兼容1.20.1
- 0san惩罚是否过低？
- 显示指令物品id候选完善
- JEI查不到热水袋等自定义配方？
- ~~项目文件夹结构优化~~
- 原木不能直接分解
- 格挡
- 反作弊机制？
- 暂时不加物理系统，建筑党退坑
- x~~吃低热量零碎概率恢复饱食度？~~
- optimize：僵尸挖方块算法（源码参考[MITE-ITE](https://github.com/XiaoYuOvO/MITE-ITE)）
- TooltipContext context 优化 什么该显示什么不显示 将appendTooltipMixin转到ItemStackMixin/getTooltip内
- 先解决全部的“（后面加）”
- 精神恢复蘑菇煲30sIII/远古陨石I/向日葵炼药
- 恒温北瓜（nilmelon）食用或炼药
- 做东西花时间
- 丛林：瘴气
- optimize：重写：logger 每个需要打印的class都有getLogger
- addtooltip mixin可能因为是item的子类armor/tool所以后面还会加自己额外的tooltip
- 优化项目结构[仿照](https://github.com/Globox1997/Dehydration/tree/1.20/src/main/java/net/dehydration)[仿照2](https://github.com/FrozenBlock/WilderWild/tree/master/src/main/java/net/frozenblock/wilderwild)拆分Reg？？？Main
- x~~debug：睡觉时食物停止腐败~~
- 文本hud宽度自适应this.getTextRenderer().getWidth(mutableText)
- postProcessor与光影是否存在兼容问题？
- 睡眠更新
    - 任何时间都能躺床上
    - 晚上9点后才能入睡
    - 躺床上回血回san掉饥渴
- 冰雪背包融化（雪球） 包括冰水瓶
- 和动物贴贴、用羊毛、干草块围住自己取暖
- 食物饮品有温度（刚加热烫嘴、雪地冰冷甚至冻结）
- 小白射箭穿过树叶 木蜘蛛？
- 石矛投掷
- 北瓜
- InGameHud Overlay 渲染 受伤发红 饥渴发黑
- 加入粪肥与移植、骨粉削弱
- 名称：手斧or短斧
- 花环
- 饮用丛林和沼泽的生水惩罚更重
- 烤蘑菇
- **config**或[自定义GameRule](https://fabricmc.net/wiki/tutorial:gamerule)
    - /gamerule hcs xxx（选，或弹出UI）
    - 食物变质
        - 是否开启
        - 速率
        - 服务器无玩家时暂停变质
    - 僵尸视距
- 制作东西需要时间
    - 制作速度受等级加成
    - 忧郁影响专注，专注影响制作速度
- 糖尿病
- optimize：根据accessWidener优化代码（如修改盔甲护甲值、extendable使得不需要自定义铲子工具（已免）、rayCast）
- 盔甲保护效果模仿MITE，而不是线性4%减伤/半格
- optimize：重写HungerManagerMixin/update、getBlockBreakingSpeed
- 寒冷环境相当于冰箱，炎热环境额外腐败速度（新nbt名称）biome.ishot是否包括丛林 注意石滩是否cold 热水袋右下角渲染颜色点红-白-蓝表示温度
- 变质受温度影响，分为3个层级（正常，原冰箱【寒冷环境同样适用，括无雪针叶林？导致冰箱无用】，新nbt—炎热环境）
- 超级热水袋：持久很多，材料昂贵（如下界合金）
- 生命水晶or初始10点血（5心）？
- ~~mixin代码优化~~
- 后面加的继续做
- 动物与作物生病
    - 作物有阳光才能长，否则枯死
- 篝火优化（燃料、燃烧旺盛程度、温度&烧焦）
- 盔甲内衬
- 冰块、小冰块（新增）、雪球、冷饮会“变质”（温暖环境）
- 去除通过炸获得木头？？
- 动物行为：饮水、吃东西
- 动物集体恐慌
- 僵尸吃肉
- 锯木头
- x~~新鲜度显示优化？？比如说添加stack渲染 如耐久条？~~
- 动物陷阱
- 熊、麻雀、乌鸦
- x~~村庄结构优化  没必要，才20kb~~
- 任务指引/成就+开局信息提醒
- 合成配方一开始就显示
- 打草得虫子（不变）
- 捡石头？
- 凋零骷髅头骨碎片？
- 翻石块、挖草方块得蚯蚓
- 生火动画，熄灭篝火x或可用nbt代替
- 用矩阵将ui图标缩小 可以放左侧弄成圆环状
- 各种果汁
- 附魔扩展攻击范围（兼容暮色森林）
- 不同的方块break instantly 有硬度差别 如花 树叶
- 怪物攻击距离当手持武器时有加成
- 弹弓
- [羊毛靴子](https://www.mcmod.cn/class/5776.html)：对幽匿感测体静音，踩不坏耕地
- 光线刺眼警告+雪盲症
- optimize：雨天草再生，长蘑菇
- optimize：中毒会寄？
- optimize：雷雨天&雨天对温度影响的区别
- optimize：玩家静止时更容易冷
- optimize：困在蜘蛛网里鼠标灵敏度下降（难以转身）
- optimize：看暮色森林维度会不会掉san
- 羊毛大衣实现[模型](https://github.com/Globox1997/EnvironmentZ/blob/1.19/src/main/java/net/environmentz/entity/model/WolfHelmetModel.java)[HeadFeatureRendererMixin.java](https://github.com/Globox1997/EnvironmentZ/blob/1.19/src/main/java/net/environmentz/mixin/client/HeadFeatureRendererMixin.java "HeadFeatureRendererMixin.java")[Cloth Config API](https://www.curseforge.com/minecraft/mc-mods/cloth-config)
- 雪鞋：在雪上行走不会减速、打湿，[不会陷入细雪](https://github.com/Globox1997/EnvironmentZ/blob/1.19/src/main/java/net/environmentz/mixin/PowderSnowBlockMixin.java)
- debuff：水下视物不清
- 可戴潜水镜或附魔“水下视物underwater vision”的头盔消除
- *原版BOSS增强*
- debug：从末地回来会重置全部状态
- 《荒野求生》灵感
    - 夜钓线
- 罐头
- 营养：盐类（后续加的）
- 联动：[参考均衡饮食](https://www.mcmod.cn/class/3599.html)
- mixin而不是nbt修改掉落列表
- ~~必加：白菜（贴图替换之前的野菜，野菜改名potherb）~~
- 修改所有的mixin函数名？
- 这个模组的作者还没有做成极端，应该把背包限制在露在外面的一栏，而且每一格只能放一个东西
- tooltips
- 会毒死
- 洞穴探险（勘探）药水、幸运药水
- 体重+debuff：瘦弱、肥胖→耐力、速度、攻击力
- 疾病系统：[牛黄](https://www.mcmod.cn/item/367703.html)
- 成就/任务系统
- 挖掘锁定、挖矿药水（急迫）



- 牛奶液体
- 瓶子装雨水、口渴满
- 多语言+繁体、梗体
- 农业改革：参考MITE、DS
- 种植机制
- 畜牧机制研究datafixer根据已有mod
- mod季节？春秋15天冬夏10天秋季开局？inv自带时间和季节指示器 黄昏哈哈x 渐变色
- 动物回血、驯服（野生会反抗，打死掉20~50块肉？，幼崽也掉），吹羊角平息恐慌（学习催眠技能书）
- 村民受伤召唤铁傀儡
- 草径上走获得速度II
- 钓鱼要鱼饵
- 通过/gamerule randomTickSpeed限制生长速度
- ~~矿界生成矿物极多，但怪危险~~
- 视觉效果
    - 溅血（红色粒子）
    - 冷热、白气
    - 水下模糊（有debuff提示）潜水镜/夜视/水下呼吸消除
    - 
- [职业模式](https://www.mcmod.cn/item/439680.html)
- Reg.LOGGER.error错误发送给服务器统计（如果重复则不发送），并告知玩家



### 润色2

- 物品
    - 合成
        - ~~四棍=一柴，四干草=一干草捆~~
        - ~~柴+干草捆+燃屑（火弓）+火绒=营火~~篝火破坏只掉灰烬
        - ~~甜菜=糖~~吃
        - 石英+瓶=经验之瓶
    - 工具
        - 木矛（+攻击距离）
        - 法杖，耗san
        - 金属弓/箭？
        - 生存
            - ~~晾干架（棍2绳2）晾草~~篝火~~（右键GUI，要燃料）~~烤，变成干草打草有一定概率掉干草，草放久了变干草（可以丢在岩浆旁边迅速干燥）
            - 打制石器扔石头
            - 火弓、火绒
            - 筛网右击沙砾
            - 前期远程：丢石块√/弹弓/回旋镖
            - 枕头（羊毛制成，原地睡觉，但是会落枕）
            - 捕食
                - 渔网、夜钓线蟹、螺、虾、鱼、蚌
                - 陷阱：蛤蟆、狼蛛、毛毛虫、蝴蝶、蟋蟀、蜗牛、蝗虫、屎壳郎、萤火虫、蜈蚣、野鼠
            - 罗盘
            - 冰柜：变质速率为四分之一
                - 硝石  硝石  硝石
                - 羊毛  水桶  羊毛
                - 羊毛  木桶  羊毛
            - 温度计：玻璃+红色染料+水瓶
            - 空调
                - 铁锭  岩浆块  铁锭
                - 铁锭     冰     铁锭
                - 铁锭  红石块  铁锭
            - ~~热水袋...~~保温水袋（tooltip冷热皆宜）~~可以刺破喝？~~
                - 合成：水瓶+皮革+羊毛
                - 温度：冻结（冰袋） 冷 凉 常温 暖 热 烫
        - 器具
            - 燧石：刀、斧
            - 铜套：五工具+四盔甲
            - ~~冰帽？~~
            - 骨器
        - 衣物
            - 雪鞋（针对雪地减速）
            - 羊毛衣
        - 睡觉
            - 草席（一次性）：晚上睡觉
            - 午睡草席（一次性）：白天睡觉
        - 辅助
            - 手持轻盈之羽设定：来自悦灵？：获得缓降buff
            - 夜视镜（宝箱）
            - 矿物透视镜：下界之星+末影之眼+玻璃或凋零直接掉落“洞悉核心（core of insight）”
            - 可种植矿石（甘蔗形态）金甘蔗 铁甘蔗矿脉快乐？/钻石羊（附魔金苹果+钻石块=羊变异饲料喂羊变？不可繁殖），薅羊毛掉钻石Fabric Wiki:Custom Events
            - 铁皮药水：抗性提升II粗制药水+铁粒
            - 回程药水：鲑鱼
            - 洞穴探险（勘探）药水：金粒
    - 食物
        - 保质期、晾干、腌制
        - 贝爷：蛆虫、蚯蚓、菱角、莲蓬（睡莲）、橡子、香蒲 止血【长在田边的香蒲，一捏就炸一咬就爆，很多人不了解它-哔哩哔哩】 [https://b23.tv/jFkHUR6](https://b23.tv/jFkHUR6)  蒲草 蒲草根茎 白色 又名象牙菜 草芽、橘子树
        - 原版优化：蒲公英汤、南瓜片、煎蛋
        - 中式：面条、馒头、包子、饺子、粽子、米饭、稀粥、汤圆、月饼、咸蛋、皮蛋、腊肉、辣条、腐竹、老干妈
        - 竹笋、内脏、钓鱼（鱼饵）、烤虫子、浆果饥荒化
- 生物（部分选）
    - 怪物改动
        - *血月*
            - ~~末影之夜，有2%概率产生，月亮为紫色，只会生成末影人~~
            - 衅尸
            - 盔甲破损debuff的怪
        - *强化*
            - 远距离发现玩家、攻击动物
            - 僵尸：尸潮、尸毒、嗜血、铁铲速挖土、TNT、扔雪球、打火石、僵尸巨人（虫后自然生成）、*牵制、跑尸、受光源吸引、拆火把（僵尸矿工，手镐子，可以挖石头，增加攻击距离）*、僵尸带武器
            - 骷髅削弱：四心：弩、虫后：“机关枪/加特林”、类似潜影贝漂浮、凋灵骷髅（但持斧，类似卫道士）
            - 蜘蛛：中毒5s、吐网、虫后：末影蜘蛛、烈焰蜘蛛
            - 苦力怕：虫后：疾行苦力怕（黄）、速爆（蓝）、高爆（红）、顶人、末影苦力怕（虫后/下界/末地？）
            - 洞穴：洞穴蜘蛛、闪电苦力怕、凋灵骷髅、蠹虫可自然生成
    - 植物作物生长地形、季节要求
        - 必加白菜
        - 木耳、地衣
        - 香蒲、芦苇制作午睡凉席
        - 水稻、糯米治疗尸毒、制作粽子和汤圆
        - 茶叶、白菜炒(熔炉)、泡菜、酸菜
        - 榕树、樟树、梧桐树、桑树
        - 北瓜食用后10s有恒温buff，材料提示可以炼药（恒温药水）
        - 青蒿、马鞭草治疗腹泻、疟疾（但疗效远不及青蒿）、艾草腹泻、疟疾（不及蒿）、感冒、驱蚊
        - 丛林：毒藤 类似于草 踩到中毒
    - 动物
        - 兔子和狼变得常见
        - *习性*驯化（度）模仿群峦传说野生躲避玩家、回血、持久逃跑、自卫、掉肉多
        - 熊、虎~~模型贴图详见网盘bigcat.js~~、狮、斑马、水母、鲨鱼、鬣狗、白蚁窝
        - 蚕（养殖）
        - 麻雀、乌鸦陷阱抓
        - 鲎



## 中期主线

中期的n条主线：

MITE线：地下世界魔改版、更强装备

BTW线：不搞机械啥也做不了

泰拉线：Boss、世界、肉后困难模式

机械/变异线：插件安装、诱变剂，类似《大灾变：黑暗之日》

剧情线：新的世界观，类似于《方舟：生存进化》

远古线：剧情线的延伸，新增远古维度作为主线之一

饥荒联机的暗影、月亮力量对抗也是很好的灵感来源



### 蓝图

- 金属工艺蓝图
- 罐头（腐烂可以倒掉） 需要特殊材质的塞子 → boss蓝图



### 地下世界前置Boss



### 三叶虫（下界前置Boss）

[参考](https://b23.tv/wVW900e)

勇敢附魔（三叶虫陨石貌似可行？）



下界门进入地下远古世界（参考饥荒）

地下新boss参考织影者、肉山（下界前置boss2）地狱使者（虫状，可以变形为肉山状，多种形状不定 渲染） 掉落的地核传送符文 解锁使后怪物增强（虫后也会增强，古怪物入侵）

怪物召唤在一个结构体内

搜寻结构体有类似末影之眼的工具（**包括下界要塞也要添加**）

下界怪物强度更变态



击败这两个Boss都会有怪物强化

考虑穿墙怪？或者类似恐怖生物，挖矿种地出怪



- 虫后所以要强化合金套，使其远远优于钻套
    - 末影飞眼（类似恶魔眼），但不掉东西
    - 疾行怪物、嗜血怪物、“召唤师”怪物、需要合金剑击杀的怪
    - 自然生成幻术师
    - 僵、白不烧
    - 盔甲破损debuff的怪
    - 丧尸病毒，有概率，增加感染值，用金苹果和虚弱药水治疗。也可以用鲎血研制疫苗



### CBM

技能点可以点，也可以爬科技线，参考CDDA的CBM/变异



### 科技线

参考BTW



### 剧情和任务



## 国风&魔幻更新

- 中国僵尸
    - 尸毒糯米+燧石锄头/~~牛黄（牛的胆囊结石）~~——洞穴生成中国僵尸，跳跃式移动，可用符纸（纸+红、黄色染料）封印（被打解印）
    - 生成意味着附近有宝藏（棺椁，骨头+腐肉+陪葬品）


# 硬核生存构思

- **核心主线**
    - 石器时代
        - 卡科技线
            - 采掘机制
                - 徒手不能撸树挖砂砾、石头，需要工具
                - 可以挖泥土，但是很慢，而且手会受伤
                - 可以徒手挖沙、雪、工具性方块
            - 废弃村庄，无村民
            - 翻箱需铁镐撬（其他天然生成的宝箱、矿车同）
        - 石
            - 材料
                - 木棍：地上随机生成石头、枯死灌木
                - 草纤维：打草/藤蔓掉→做纤维绳
                - 锋利石片：左击坚硬方块打制，有概率掉落（取决于经验等级）
            - 工具
                - 石刀：攻击、砍树叶、砍藤蔓、树木去皮左右键皆可
                - 石锥：可以用来挖砂砾，进入下一阶段
                - 石矛：武器（1.5攻击距离）
        - 燧石
            - 材料：锋利燧石（打制）
            - 工具：矛、燧石刀、燧石斧（用来砍树，进入下一阶段）
    - 蓝图与科技解锁（金属工艺、魔法？）
        - 铜器时代
            - 挖沙砾，获得粗铜粉末（9个合成1粗铜）
            - 合成熔炉（原版）烧炼粗铜：黏土球→篝火→红砖→砖块（特性：可以用石锥挖）
            - 做工具要学习金属工艺蓝本以解锁(手持的溺尸/僵掉/刷怪笼遗迹/沙漠钓鱼掉落学习不会消耗)
            - 铜制五工具+四盔甲
        - 铁、钻石器时代
            - 护甲削弱
                - 头30%体40%腿20%脚10%
                - 削弱皮套、铁套，钻套防御\<合金套
                - 原版（钻套为例）：头15%体40%腿20%脚15%
    - 下界前置Boss：巨型三叶虫
        - 肉山性质
            - 虫前：下界门不能进入一触即碎，并提示“传送被来自远古的力量中止”
            - 虫后：进入下界门、怪物强化、末影飞眼（但只掉碎片）
        - 召唤
            - 用鲎(Horseshoe Crab)血之刃鲎血和龟壳合成
            - 砍海底神殿的守卫者，产生轰的音效和粒子效果
            - 守卫者螺旋上天并死亡（获得成就：远古寻亲）
            - 掉落喷溅型恒温药水，原地生成巨型三叶虫
        - 特征
            - 天上飞（一阶有翅膀）、水里游（二阶掉翅膀半血）
            - hp：凋零的一半
            - 攻击方式：一阶冲撞、二阶激光（继承守卫者）
            - 掉落：远古陨石（提示：放在快捷栏上能正向调节你的脑电波用人话：置于快捷栏能使你放松）
        - 强化龟壳：由水下呼吸10s转为5min，夜视
    - 进一步发展剧情（类似灾厄，待构思）
        - 剧情
            - 为什么主角不像史蒂夫，有现实中人类的生理需求，也不能徒手撸树？
                - 极端气候+生态系统崩溃+生化危机+核战争→地球无法居住→人类需要移民到其他宜居行星上
                - 飞船上供人类存活的物资不够→绝大部分人类需要上传意识到飞船的计算机中（虚拟数字生命方舟计划），等到到达之后再利用高科技复刻人体，并将记忆重新植入复刻品的大脑
                - 为了确保人类文明继续发展，存储数值生命的计算机继续保持运转，并以恒星辐射为能量来源→这些意识会在模拟现实世界的程序中==真就地球online了==继续存活
                - 在航行过程中，AI想代替人类意识，复刻出属于自己的生命体→因此想毁灭人类→企图改造运转程序→不慎将主角的意识放到了MC世界中==这很老麦==→穿越后的主角仍然保持了人类的生理需求
                - 这些剧情需要碎片化，分散在玩家的初始物品（日记）、Boss掉落物内
            - 为什么会有末影三叶虫阻止玩家进入下界？
                - AI的举动被人类察觉，经过激烈的镇压，终于制服了AI
                - 因为数据量过大，AI功能受限→在游戏世界之外的“地球online”平行电子世界的人类暂时找不到残存在游戏世界中的意识→决定将游戏通关作为逃离游戏世界的出口
                - 因为主角是重点人才（这也解释了为什么前面AI优先挑选主角下手），所以AI不想让主角回到虚拟现实世界→因此尝试阻止其通关，创造了末影三叶虫
                - 击败末影三叶虫后，AI虽然已受控制，但其在该游戏世界残存的代码片段可以继续为非作歹，这让部分游戏世界成了法外之地→“虫后”困难模式的成因→出于对主角的变本加厉，想进一步阻挠
                - 然而主角通关后发现，又爆发了AI与人类数字生命的冲突。主角为了暂避锋芒，选择继续留在游戏世界
            - 第三人称叙事
                - 有待构思，这里讲的是其它数字生命穿越到该游戏世界的遭遇
            - 过分的剧情不提倡（猫砂），因为沙盒游戏玩家扮演的是自己，这样做反而会影响代入感（好的故事不一定要有代入感）；可以碎片化剧情，从旁观者的角度看他人的故事
        - 事件
            - 参考TR
        - 成就
            - 更改MC主线data
                - 拾荒者——打草
                - 钻木取火——生火（成就就是新手引导？）
                    - 热门话题
                    - 凉白开
                - 石器时代
                    - 燧石！
                - 知识的力量——蓝图
                - 下矿！——铜镐
                - 你这钻石套是假的吧？*替换钻石护体*
                - ~~远古猎手~~翻天覆地！——三叶虫
            - 自定义
                - 最大生命！
                - 解药——尸毒
                - 管他春夏与秋冬（no matter what season it is）——恒温药水
                - 内心强大——远古陨石
- **生存机制**
    - 急救系统
        - 生命限制
            - 上限
                - 初始8点血，每升3级加1点血
                - 血量上限取决于经验等级最高记录而不是当前等级
                - 考虑加生命水晶？
            - 恢复
                - 恢复缓慢
                - 辅助恢复
                    - 食疗
                    - 蜘蛛腺、九死还魂草（回san回血）
        - 分身体部位HP及受伤影响
        - 伤口及其处理
            - 疼痛、流血（毛静动）、骨折、伤（刮、磕、深、撕裂）
                - 可以只有两个流血程度（轻度不回血，重度掉血，绷带止血；不严重的伤口可以缓慢自行止血）
                - 重伤debuff
            - 消毒、缝合、包扎、敷药
                - 绷带：开局送、亚麻纤维、僵尸掉衣服撕成碎布条草纤维
            - 丧尸病毒？血清疫苗？
    - 体质系统
        - 角色特质\*
        - 体力
            - 体力不支debuff削弱挖掘、战斗、移动能力
            - 允许玩家直接坐在地上快速恢复
        - 体重
            - 掉重
                - 饿\<50%
                    - 0%不会立刻饿死，饥饿掉到0有debuff（极饿/starving/殍[整活语言]），快速消耗体重
                    - 营养不良
                    - 口渴
                    - san低
                    - 长期劳累
                - 增重
                    - 吃饱后继续吃~~，直到120%~~（吃撑buff/stuffed）
                    - 吃肥肉（添加物品）、糖而饱
                - 体重异常有相应惩罚（PZ）
        - 负重
            - 负重debuff解决：轻盈药水
        - 睡眠
            - ~~清醒：睡觉≈2：1~~
            - 困倦：玩家连续一个游戏日不睡即可获得。减50%耐力恢复（为了不坑，不减攻击力攻速）可以用茶、咖啡暂时消除。
            - 多人模式（可设置）不适用
        - 疾病和药物
            - 蝙蝠=肺炎+狂犬病（有潜伏期debuff）鲎血制作疫苗
            - 感冒板蓝根（一种植物）
            - 蚊虫叮咬
            - 禽流感吃生鸡肉、肺炎吃生蝙蝠肉、被咬，缺氧、肺衰竭、高原反应氧气罐，爬山下矿用
            - 低温症/冻伤、中暑
            - 败血症、营养不良、腹泻
            - 疟疾青蒿
            - 腹泻（生水）加快25%饱食度和水分流失，呕吐（脏水等）加快100%失水
            - 雪盲症（沙漠也有）涂抹木炭/灰烬获得雪盲抗性8min
            - 剧毒（参考饥荒海难）
    - 心理系统
        - San值
            - 减
                - 打怪或被打/追
                - 黑暗（包括夜晚）、洞穴
            - 加
                - 持花
                - 吃花、蘑菇煲、肉干、干海带、糖、可可（巧克力）
                - 理智药水（向日葵）
                - 睡觉
            - 掉光：幻视——晚上眼睛、白天黑影、画面黑白/重影，过低有血丝（参考DS）、幻听（可怕音效）、san0则无法挖掘、战斗、种植、物品贴图名称错乱
        - 情绪
            - 恐慌panic（随着时间推移减弱）~~掉san~~降低击打精准度无畏药水，金南瓜/诡异菌PZ、疼痛（有类似黑暗闪烁的效果，包括饥渴=0?）麻木药水止痛红下界蘑菇或新植物？
            - 无聊（选）、忧郁
            - （选）焦虑、愤怒
    - 饮食系统
        - 饮水系统
            - 水分消耗
                - 受温度、运动等影响
            - 补水
                - 空手右键喝水（浑水/生水/海水）生水—腹泻(掉水、饱)，海水浑水—干渴，丛林沼泽——中毒口渴且准星对准水：msg(按住ctrl喝水)
                - 自动喝水
                - 凉开水、蒸馏水
                - 西瓜等食物补水
        - 更多食物、食物的变质、制备和储存
        - 营养系统
            - 设定
                - 蛋白类、果蔬类、碳水类
                    - 前期糖类：浆果（新造）、香蒲、种子、桦橡栗子
                - 营养模仿mite
                    - 荤素此消彼长，谷物单独
            - 显示：在背包/用面包、肉、胡萝卜堆叠图标代替饥饿
            - 惩罚：营养不良（回血速度-50%，饥饿速度+50%）
    - 温湿度系统
        - 体核温度
            - 影响因素
                - 环境
                    - 群系==兼容季节==
                    - 时间
                    - 方块：泡水、火、岩浆、冰雪
                    - 高度：高空、洞穴恒温
                    - 天气
                - 自身：运动、衣着（改变体感温度、延长或缩短冻结或热炸时间）
            - 受影响后变化
                - 安全范围内：显示为温度计图标（右下角史蒂夫头）
                - 超出安全范围
                    - 有冻结时间和升降~~(用冰/火焰填充白底人形表示)~~显示
                    - 冻伤、中暑 / 低温症 热衰竭热射病
                    - Damage source:freeze/fire
        - 体表湿度
            - 泡水、淋雨
            - 玩家的行为跟状态决定本湿度，与当地的环境固定湿度加减法得出表湿度
            - 潮湿debuff：降低体温
    - 排泄系统
        - 屎尿屁
        - 在背包界面内某个角落添加两个格子
            - 一个是💩，可以拿出不能拿进，累计满64就会随地掉落，可扔可吃可堆肥可施肥
            - 另一个是尿，可以点击旁边的按钮排出，能浇灌农作物、将泥土变为泥巴；也能用容器接住并喝掉/浇灌。同样64单位，累计满随地小编（有粒子效果和音效）
            - PS：怪物和boss带来的恐慌debuff可答小辩失禁
- **优化更新**
    - 自然更新
        - 生存更新
            - 如前期优化（如石头、生火等不要太抽象）
        - 空气拓展
            - 减：洞穴、高处（适应以后不会，并产生高原免疫buff）、下界跑步打斗
            - 加：树叶、水下呼吸（buff、附魔）
            - 掉光：死于缺氧
            - 有毒易燃气体：瓦斯（沼泽、挖煤点火）
        - 潜水更新
            - 水压过高潜水服或潜水附魔
        - 生物AI优化、怪物强化
        - 农业改革
            - 动物AI优化、驯化系统（参考DS）
            - 种植（参考MITE、PZ）
            - 新的动植物、地形和耕作机制
        - 季节
    - 中式&魔幻更新
        - 食物及烹饪
        - 装饰
        - 玄幻志怪
        - 可探索的结构和维度、神器
    - 剧情线更新
        - 新手引导、任务系统（参考星露谷、CDDA）
        - 新的世界观
        - 新Boss
        - 后期没必要过多自造，交给其它mod

# 硬核生存反馈

科技mod里面，机械动力，植物魔法这种绕开电的玩起来都很让人觉得新颖



作者大大，我想提供一下建议。

增加一个buff《肾腺素》，是人体肾上腺皮质分泌的一种激素当人遇到惊吓或者是兴奋时候，会分泌这种激素，为身体提供更多的能量，就是可以加速心跳，可以让血压上升，可以让血管扩张。

就是在《被攻击》《恐慌》《有点害怕》《惊慌》《被漆黑笼罩》的时候加一个《肾腺素》。效果：血压升高、心率加快，感觉不到疼痛，移动增加+体力增加。如果《被攻击》后，肾腺素结束会感觉到疼痛、掉血、体力不支，头晕。如果没有《被攻击》肾腺素结束会感觉到头晕。《可以用食物恢复状态》

可以增加一个在穿上盔甲后《感到安全》。效果：-恐慌降低，降低-惊慌之中没能击中的效果，增加《勇敢》

僵尸挖掘方块的速度有点快，可以调低一点点，不然玩家堵上了门口，很快就会被僵尸挖掘掉，很难让玩家在洞里生存，僵尸挖树叶更快



僵尸可以边打村民边撸方块，还是格着方块挖

还有用木棒和其他的剑砍竹子的速度未免太快了罢



【潜水】时夜202&nbsp;15:20:51

但是这个挖沙砾的过程太长了，虽然和比mite到达铜器时代要快不少



【潜水】时夜202 15:21:28

但中间没有多少有效内容



【潜水】时夜202 15:21:48

就是，BTW在新石器时代需要考虑生计，打猎疯狂砍树烧肉

mite是需要挖完沙砾做工具然后跑图杀生

硬核生存这个时段少了点内容

感觉可以下点文章

而且也不缺食物

可以稍微削弱一下食物储量

还有，不要听他们说的这么模组哪哪很难，哪里太差

我体验下来觉得这个模组甚至还太简单了

只要早点做出床就简单了

没床还是比较痛苦的

钓鱼系统是不是削的过头了？试了试好像只有蚯蚓能用作鱼饵

感觉可以改成

蚯蚓，腐肉，蜘蛛眼

这种可以合成一个鱼儿

腐肉太多了，晒成的皮革还不能堆叠

晚上呆树上，下面放篝火加船一晚上将近一组腐肉，



抱歉，各位

这期视频暴露出了模组的一些问题，我会继续改进的

1. 有时莫名其妙失血而死，尤其是san过低时发生，我当初设计的时候没加这一条，不太清楚什么情况
2. 打制成功率过低（当初设计打制燧石的成功率至少为25%，后面调整为至少40%，不知道是运气原因还是伪随机数的局限性，视频中表现出的爆率太低了）
3. 燧石斧砍树太慢，这是个bug，可能是优化算法后出了些问题
4. 与动态光源兼容不够好，手持光源仍然会受到黑暗的威胁
5. 矿车奖励太丰盛了
6. 很容易感冒
7. **村庄生成**



连锁砍树附魔



太难了吧，建议初始血量20



回复@凝雨菌:[doge]还能提一个小建议吗，希望针对原版最最最变态的村民交易系统中的附魔书交易动刀[妙啊]比如村民只能交易最基础的1级附魔，且两个同级附魔不能通过铁砧加——[妙啊]



建议还是把死亡掉血条这个去掉，本身就是难度偏大，很有可能后面变得没法玩今天18:59 回复点赞删除该通知

后面会出模组难度选项乃至配置，会将这个功能加进去。



空手手太短了



大佬建议加强死亡惩罚不然靠复活一些重置状态太无敌了



这个手太短了，看的出来作者是打算根据武器延长攻击范围，但这种贴脸才能打T到的感觉极度不适，建议加长一点



其他的还行，就是惊慌之中打不中这个机制能不能去掉（



复@凝雨菌:加油，因为你攻击距离，你对标现实，对标僵尸模型，对标人物模型来说，这个攻击距离都不是太合常理的，所以个其实相当于一点平衡性了，已经不是说是追求现实的那种了。已经很棒了，但是我希望你能更棒。加油



营养学

各种营养

新的主食



攻击CD没拉满的情况下打出去消耗的体力更少，否则更多

死水寄生虫感染概率更高！



难度平衡性有点差，主要是因为参数太多了吧，前期血量低，一个失血就死了，其实从视频来看，食物也是一个很重要的点，有一些食物补的太少了，有点不太实际[笑哭]其实要体现出食物的困难可以从另一个角度突破，没必要限制食物补充的量，毕竟我们日常一日三餐对吧，每一餐吃的量相比我们个体大小来说实际上是很少的，而且也不需要不停的进食，可以在食物这方面改进为营养均衡之类的，不能光吃一种食物，在一个我认为既然难度摆在这里，1空手实在是太短了，2本身就有惊慌难以击中和空手受伤，那僵尸的智商和实力就应该削弱一些（尤其是小僵尸过于逆天，我觉得的话，如果要真实，这种小型生物的速度和攻击力都应该逊色于大的僵尸才对啊，你想如果在现实当中遇到一个六七岁的小孩，哪怕是僵尸，难道两个成年人打不过吗？甚至被秒杀）再就是每一种debuff都应该是一物降一物的，例如做出床之前也会困，可以蹲下恢复san值和体力，有了床之后也应该有生物节律，如果不按照正常作息（游戏中的红石刻）睡觉会减少san值恢复量之类，像恐惧啊，幻觉啊，人的意志应该不会在一天之内打垮吧（视频里面基本上没有一条命活过一天的，这个幻觉之类的来得太快了，我认为在没有受伤的情况下困倦和惊慌、口渴饥饿以及温度人在第一天应该是可以适应的，不应该有太大的波动，也许两天之后才会出现生理上的失调，加上了这一点，也许也是对新手玩家的一种保护，毕竟这个血量每死一次就在减少，难度可以说是飙升，参数前两天我觉得应该减少慢一点，debuff持续维持超过一段时间之后，再让一些生理不适的效果程成指数上升，例如更容易惊慌，难以击中怪物，虚弱，幻觉，失明，缓慢等等各种负面效果开始指数增加）以上是我的一些建议，希望作者能耐心看完希望加下一个树倒下的mod，而与此同时消耗更多的耐久还有就是既然要真实，为什么砍树没有连锁，树漂浮好像就不太真实，建议加一个砍树的包[笑哭]



建议增加一个熟练度属性

无论是打制，还是战斗击败僵尸，宰杀牛羊等牲畜，亦或是砍树挖矿等都能够通过熟练度的提升获得相应的增益

如：打制熟练度提高后打制燧石等成功率上升

战斗熟练度提升后空手不再受伤，对怪物的伤害加成等

宰杀牛羊牲畜的熟练度提升后获取的皮革肉类数量增加等

挖矿砍树的熟练度提升后采集速率提升或是体力消耗等

增加玩家在游戏中的获得感减少一些挫败感



连锁砍树



提出一些建议。整合包最好还是不要什么都有比较好。

这样会导致玩家不知道侧重点，比如，在mite中加入黑暗恐惧就是个坏点子。

小僵尸建议删除或者削弱，这在原版也是让玩家很头疼的怪物。

mite的设定不适合作为一个要素，他是和自身的游戏内容相辅相成才达到的效果，不可重复。

BTW是一个机械动力mod，他的特色也是时代的革新，其他的内容可能并不兼容现在的整合包体系

减少繁琐，突出重点会很好。真的，目标很重要

大部分硬核生存的特点就是剥夺玩家的获取，然后返还回来。

原版之中大家的需求很容易就被满足，但需求是可以被强制创造的



作者大大，我想提多一个建议。

就是也把连锁挖矿加进去，改成一本附魔书。也可以在附魔台里附魔到，只能附魔在铁镐子级别以上的镐子，只能连锁挖掘矿物，石头之类的连锁挖掘不了。

附魔书名称《挖掘》效果：连锁挖矿

一共有五级：

1.《挖掘 Ⅰ 》连锁挖掘两块矿物，有《45％》触发效果。

2.《挖掘 Ⅱ 》连锁挖掘三块矿物，有《40％》触发效果，挖掘两块矿物效果提高至《60％》。

3.《挖掘 Ⅲ 》连锁挖掘四块矿物，有《35％》触发效果，挖掘三块矿物效果提高至《55％》，挖掘两块矿物效果提高至《75％》。

4.《挖掘 Ⅳ 》连锁挖掘五块矿物，有《30％》触发效果，挖掘四块矿物效果提高至《50％》，挖掘三块矿物效果提高至《70％》，挖掘两块矿物效果提高至《90％》。

5.《挖掘 Ⅴ 》连锁挖掘六块矿物，有《25％》触发效果，挖掘五块矿物效果提高至《45％》，挖掘四块矿物效果提高至《65％》，挖掘三块矿物效果提高至《85％》，挖掘两块矿物效果提高至《100％》。

每挖掘一次矿物，随机触发一个效果。

附魔到《挖掘》加上《时运》，连锁挖掘，每块矿物都会触发时运效果。

附魔《挖掘》，需要看运气。比砍伐还要难附魔。

谢谢作者大大



我感觉这个整合包最大的问题其实在于内容还太少，导致游玩基本就是重复的刷刷刷，关键东西刷出来后难度大幅下降就开始和原版生存很像了。难度高实际上是无所谓的，因为该玩的人总是会去尝试挑战，但搞低概率抽奖这套，特别是去抽关键道具，这个很搞人心态。很多优秀的整合包都有自己的抽奖，包括原版基本也是抽奖游戏，但这东西全都不是用来卡玩家让玩家难受的，更多的是给玩家探索或者战胜高难试炼后的一种奖励。



感觉可以搞个UI设置，可以试着搞一点不同风格的UI，满足不同的人[星星眼][星星眼]



这个模组更多的是对玩家削弱部分，还缺少加强怪物的部分，如果真搞困难生存可以像猛男生存或者史诗攻城那种玩家在地表根本活不下去，而这个模组目前只要准时睡觉保证食物基本就是稳定发展，都困难包了来个永夜或者白天生怪也是可以的，最好随生存时间逐渐加强怪物防止后期过于安逸[思考]（其实现在作为单独模组完成度感觉已经很高的，如果做困难整合包感觉可以的）



感觉中期矿物还是太容易获得了，可以在削减前期难度的同时，增加一些中期挖矿的难度。[脱单doge]

给个建议：

挖矿掉落矿砂，必须用筛网在水中淘洗后概率获得粗矿和粗矿粒。比如挖掘铜矿后掉落1个铜矿砂，淘洗后20%得到粗铜，80%得到粗铜粒。矿砂直接合成则获得相应的颜料，铜矿砂→绿色染料，铁矿砂→橙色染料，金矿砂→金色染料（额外加入金色和银色染料）

将高炉改为多方块结构，可以用红砖+煤炭块+熔炉搭建，除了铜矿以外的其他金属都必须使用高炉炼制。（目的是避免玩家随身携带熔炉，从而增加中期铁锭等资源获取难度）

此外增加钻石获取的难度，同时增加获取途径。铁镐挖掘钻石矿获得1～4个钻石粒，钻镐以上等级的镐子挖掘钻石矿获得1～2个钻石。同时增加“淘金”玩法，在水中淘洗沙砾有1%概率得到钻石粒和金粒。

前期就不要用石头的获取折磨玩家了，除了打制燧石的玩法外，建议加入2个燧石→一个磨制燧石的合成，同时恢复木锄和石锄的合成，让玩家可以更早地发展农业填饱肚子（可怜的玩家只是想填饱肚子，又有什么错呢[大哭]）



如果只是调玩家或者怪物的数值那没啥意思，应该在食物获取下文章。比如动物刷新降低或者不刷新要靠繁殖，耕种不是一下就完成，植物需要更久的生长时间需要各种化肥骨粉没有用。矿物需要模具，需要更复杂的熔炼



感觉可玩性不多，获得工具后单纯就是原版的一个困难版，多加一点东西会比较好不过毕竟不是整合包



其实我觉得可以加入类似原先虚无3的任务指引里面的蕴魔之心这种机制，合成或者领取蕴魔之心来降难度(门外汉发言)



 有没有考虑过仿一个burning furnace和lit it up的熔炉机制¿



勇敢附魔（三叶虫陨石貌似可行？）



回复 @凝雨菌 :感觉可以加个初期获得铜粉的途径，参考群峦的洗矿槽，开局硬磨沙砾真的折磨，还得要磨29个粉才能出镐子



很多人说mod难，那作为一个玩了一半mite的人我来说一下这个mod到底哪里导致难以及mod的最主要的问题

和我看到的一个弹幕一样，实际上这个mod并不是难，而且阻碍太大

作者应该是想和mite对标的，但是作者只对标了时间却没有对标机制，要知道虽然mite虽然做出第一个木头虽然也需要一两个小时，但mite的节奏是非常充实的，以至于你并不会觉得这个过程无聊之类的(具体原因其实得自己去玩才能体会到)

而这个mod具体家难度的地方其实也很局限，

首先他并没有mite不会刷新小动物和植物要生长30游戏日的机制，导致食物实际上是不会缺的

其次怪物僵尸也不会破坏方块，小白也不能百格方块射击(虽然这么说，但实际上mite前期大部分阴间怪物是遇不到的，所以你并不会有一种怪物强的没法玩的感觉)，所以怪物的真实实力实际上很低，诸如视频中甚至放个铁轨就能无伤

而最难的地方也就是那些效果，但这也是最不合理的地方，前期玩家物资不可能多，而那么多效果注定玩家是要死的(要知道mite也有效果可都不完全致命，而且mite在第一次睡觉之前是不会获得某些效果的)，而虽说死可死亡惩罚却又太低(如前所属，实际上这个mod怪物的含金量很低)，况且死亡惩罚也是有下限的，加上前期根本没法处理乱七八糟的效果死亡收益甚至大于存活

概述:作者想借鉴mite的机制，但并没有借鉴到mite本质的困难以及对应的平衡，而是将许多浅显的机制混杂到一起导致前后期难度完全不平衡。

所以说白了其实压根没什么难点，就是一味地繁琐，一味的恶心玩家



是啊，真限制食物应该是和MITE一样，MITE食物恢复甚至比原版要多，但是MITE有两个机制，一个是正常情况下所有的小动物不会刷新，第二个是植物生长需要30游戏日，相当于前期必须去跑图找食物，而且会越来越难找，但是虽然这样也有小麦种子，糖，菊花汤，南瓜种子之类的平衡，就会处于一种你食物一直是缺的，但是正常来说又缺不死的绝对平衡

即使后期你依然要坚固植物生病，动物生病，动物排泄等因素，可以说MITE的食物是真的平衡的很好



**谢谢，看过了，营养、手长、小僵尸削弱、真实砍树、食物获取、san优化这些都会调整的**



和朋友玩了很久这个mod，现在想对大佬提供一点点思路帮助你开发mod

钓鱼方面。虫子的爆率实在是感人，看了攻略也没有发现钓鱼方面的信息，不知道除了虫子还有什么东西可以用于垂钓？或许可以自己做饵料？



前期的开荒方面：我对于前期铜的获得的评价是，为了困难而难。枯燥的挖砂砾有点折磨。缺少了趣味性。或许可以设计一个特殊熔炉通过烧砂砾获得？或者烧其他的某些东西。纯挖沙子确实有点恶心了（站在游戏性角度）。



关于核心主线。我觉得还是科技比较好。毕竟是硬核生存，感觉魔法有点不太妙。不是魔法不好，感觉脱离了这个题材。科技可以出一些钻头呀之类的提升挖掘效率的物品，还可以有氧气罐之类辅助下矿的物品。感觉科技的效果会很好



对于思维导图中 急救部分的 我还是比较认可的。这个部分可以参考逃离塔科夫这个游戏的治疗系统。我觉得他们做的不错。可以借鉴



任务系统感觉可以提升一下优先度，任务系统然后再给一点奖励是极好的。可以帮助我们快速的入手这个mod



mod很喜欢！希望大佬可以越做越好，我也只是提供一点建议，毕竟也是很喜欢这个mod





建议 1流血会导致休克，流血过多会导致休克而死亡，收到某些特定的大力伤害可能会伤到动脉，有大流血(大出血)效果

2 加入类似于膳食均衡mod ，分别为糖类(碳水化合物)，水分(当然可以独立出去)，脂肪，蛋白质，维生素，微量元素



糖类过少会导致自己力量减弱，你会没有力气走路，挥剑，但是还是有一点伤害，减50%



糖类，蛋白质，脂肪暂时想不出对策



同时加入营养过剩或过少策略，这样会有贫血症，糖尿病等(但都是可逆的，为了游戏)



膳食均衡解锁条件:获得铁镐后的第3天，并产生提示，现在，你开始注重自己的营养了

3 金属有良好的导热性， 合金的硬度，抗腐蚀往往比与其构成的纯金属要好



加油可以整点特殊事件比如山火和洪水之类的

