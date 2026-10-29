package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class tl6 {

    /* JADX INFO: renamed from: c */
    public static final tl6 f31231c;

    /* JADX INFO: renamed from: d */
    public static final tl6 f31232d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ tl6[] f31233e;

    /* JADX INFO: renamed from: a */
    public final ul6 f31234a;

    /* JADX INFO: renamed from: b */
    public final byte f31235b;

    /* JADX INFO: Fake field, exist only in values array */
    tl6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    tl6 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    tl6 EF0;

    static {
        tl6 tl6Var = new tl6("DOUBLE", 0, ul6.f31982d, 1);
        tl6 tl6Var2 = new tl6("FLOAT", 1, ul6.f31981c, 5);
        ul6 ul6Var = ul6.f31980b;
        tl6 tl6Var3 = new tl6("INT64", 2, ul6Var, 0);
        tl6 tl6Var4 = new tl6("UINT64", 3, ul6Var, 0);
        ul6 ul6Var2 = ul6.f31979a;
        tl6 tl6Var5 = new tl6("INT32", 4, ul6Var2, 0);
        tl6 tl6Var6 = new tl6("FIXED64", 5, ul6Var, 1);
        tl6 tl6Var7 = new tl6("FIXED32", 6, ul6Var2, 5);
        tl6 tl6Var8 = new tl6("BOOL", 7, ul6.f31983e, 0);
        tl6 tl6Var9 = new tl6("STRING", 8, ul6.f31984f, 2);
        f31231c = tl6Var9;
        ul6 ul6Var3 = ul6.f31987i;
        tl6 tl6Var10 = new tl6("GROUP", 9, ul6Var3, 3);
        f31232d = tl6Var10;
        f31233e = new tl6[]{tl6Var, tl6Var2, tl6Var3, tl6Var4, tl6Var5, tl6Var6, tl6Var7, tl6Var8, tl6Var9, tl6Var10, new tl6("MESSAGE", 10, ul6Var3, 2), new tl6("BYTES", 11, ul6.f31985g, 2), new tl6("UINT32", 12, ul6Var2, 0), new tl6("ENUM", 13, ul6.f31986h, 0), new tl6("SFIXED32", 14, ul6Var2, 5), new tl6("SFIXED64", 15, ul6Var, 1), new tl6("SINT32", 16, ul6Var2, 0), new tl6("SINT64", 17, ul6Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tl6(String str, int i, ul6 ul6Var, int i2) {
        super(str, i);
        this.f31234a = ul6Var;
        this.f31235b = i2;
    }

    public static tl6[] values() {
        return (tl6[]) f31233e.clone();
    }
}
