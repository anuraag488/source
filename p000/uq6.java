package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
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
public final class uq6 {

    /* JADX INFO: renamed from: c */
    public static final uq6 f32108c;

    /* JADX INFO: renamed from: d */
    public static final uq6 f32109d;

    /* JADX INFO: renamed from: e */
    public static final uq6 f32110e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ uq6[] f32111f;

    /* JADX INFO: renamed from: a */
    public final ar6 f32112a;

    /* JADX INFO: renamed from: b */
    public final byte f32113b;

    /* JADX INFO: Fake field, exist only in values array */
    uq6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    uq6 EF2;

    static {
        uq6 uq6Var = new uq6("DOUBLE", 0, ar6.f14830d, 1);
        uq6 uq6Var2 = new uq6("FLOAT", 1, ar6.f14829c, 5);
        ar6 ar6Var = ar6.f14828b;
        uq6 uq6Var3 = new uq6("INT64", 2, ar6Var, 0);
        f32108c = uq6Var3;
        uq6 uq6Var4 = new uq6("UINT64", 3, ar6Var, 0);
        ar6 ar6Var2 = ar6.f14827a;
        uq6 uq6Var5 = new uq6("INT32", 4, ar6Var2, 0);
        uq6 uq6Var6 = new uq6("FIXED64", 5, ar6Var, 1);
        uq6 uq6Var7 = new uq6("FIXED32", 6, ar6Var2, 5);
        uq6 uq6Var8 = new uq6("BOOL", 7, ar6.f14831e, 0);
        uq6 uq6Var9 = new uq6("STRING", 8, ar6.f14832f, 2);
        f32109d = uq6Var9;
        ar6 ar6Var3 = ar6.f14835i;
        uq6 uq6Var10 = new uq6("GROUP", 9, ar6Var3, 3);
        f32110e = uq6Var10;
        f32111f = new uq6[]{uq6Var, uq6Var2, uq6Var3, uq6Var4, uq6Var5, uq6Var6, uq6Var7, uq6Var8, uq6Var9, uq6Var10, new uq6("MESSAGE", 10, ar6Var3, 2), new uq6("BYTES", 11, ar6.f14833g, 2), new uq6("UINT32", 12, ar6Var2, 0), new uq6("ENUM", 13, ar6.f14834h, 0), new uq6("SFIXED32", 14, ar6Var2, 5), new uq6("SFIXED64", 15, ar6Var, 1), new uq6("SINT32", 16, ar6Var2, 0), new uq6("SINT64", 17, ar6Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uq6(String str, int i, ar6 ar6Var, int i2) {
        super(str, i);
        this.f32112a = ar6Var;
        this.f32113b = i2;
    }

    public static uq6[] values() {
        return (uq6[]) f32111f.clone();
    }
}
