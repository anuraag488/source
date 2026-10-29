package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class u15 {

    /* JADX INFO: renamed from: c */
    public static final q15 f31600c;

    /* JADX INFO: renamed from: d */
    public static final r15 f31601d;

    /* JADX INFO: renamed from: e */
    public static final s15 f31602e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ u15[] f31603f;

    /* JADX INFO: renamed from: a */
    public final v15 f31604a;

    /* JADX INFO: renamed from: b */
    public final byte f31605b;

    /* JADX INFO: Fake field, exist only in values array */
    u15 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    u15 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    u15 EF2;

    static {
        u15 u15Var = new u15("DOUBLE", 0, v15.f32312d, 1);
        u15 u15Var2 = new u15("FLOAT", 1, v15.f32311c, 5);
        v15 v15Var = v15.f32310b;
        u15 u15Var3 = new u15("INT64", 2, v15Var, 0);
        u15 u15Var4 = new u15("UINT64", 3, v15Var, 0);
        v15 v15Var2 = v15.f32309a;
        u15 u15Var5 = new u15("INT32", 4, v15Var2, 0);
        u15 u15Var6 = new u15("FIXED64", 5, v15Var, 1);
        u15 u15Var7 = new u15("FIXED32", 6, v15Var2, 5);
        u15 u15Var8 = new u15("BOOL", 7, v15.f32313e, 0);
        q15 q15Var = new q15("STRING", 8, v15.f32314f, 2);
        f31600c = q15Var;
        v15 v15Var3 = v15.f32317i;
        r15 r15Var = new r15("GROUP", 9, v15Var3, 3);
        f31601d = r15Var;
        s15 s15Var = new s15("MESSAGE", 10, v15Var3, 2);
        f31602e = s15Var;
        f31603f = new u15[]{u15Var, u15Var2, u15Var3, u15Var4, u15Var5, u15Var6, u15Var7, u15Var8, q15Var, r15Var, s15Var, new t15("BYTES", 11, v15.f32315g, 2), new u15("UINT32", 12, v15Var2, 0), new u15("ENUM", 13, v15.f32316h, 0), new u15("SFIXED32", 14, v15Var2, 5), new u15("SFIXED64", 15, v15Var, 1), new u15("SINT32", 16, v15Var2, 0), new u15("SINT64", 17, v15Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u15(String str, int i, v15 v15Var, int i2) {
        super(str, i);
        this.f31604a = v15Var;
        this.f31605b = i2;
    }

    public static u15 valueOf(String str) {
        return (u15) Enum.valueOf(u15.class, str);
    }

    public static u15[] values() {
        return (u15[]) f31603f.clone();
    }
}
