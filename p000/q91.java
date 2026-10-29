package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q91 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public long f28310A;

    /* JADX INFO: renamed from: B */
    public boolean f28311B;

    /* JADX INFO: renamed from: C */
    public /* synthetic */ Object f28312C;

    /* JADX INFO: renamed from: D */
    public Object f28313D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f28314E;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f28315u;

    /* JADX INFO: renamed from: v */
    public long[] f28316v;

    /* JADX INFO: renamed from: w */
    public int f28317w;

    /* JADX INFO: renamed from: x */
    public int f28318x;

    /* JADX INFO: renamed from: y */
    public int f28319y;

    /* JADX INFO: renamed from: z */
    public int f28320z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q91(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f28315u = b;
        this.f28314E = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28315u;
        Object obj2 = this.f28314E;
        switch (b) {
            case 0:
                q91 q91Var = new q91((r91) obj2, wm0Var, (byte) 0);
                q91Var.f28312C = obj;
                return q91Var;
            case 1:
                q91 q91Var2 = new q91((r91) obj2, wm0Var, (byte) 1);
                q91Var2.f28312C = obj;
                return q91Var2;
            case 2:
                q91 q91Var3 = new q91((vv3) obj2, wm0Var, (byte) 2);
                q91Var3.f28312C = obj;
                return q91Var3;
            default:
                q91 q91Var4 = new q91((ge4) obj2, wm0Var, (byte) 3);
                q91Var4.f28312C = obj;
                return q91Var4;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28315u;
        ju4 ju4Var = ju4.f22634a;
        b24 b24Var = (b24) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((q91) create(wm0Var, b24Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0235  */
    /* JADX WARN: Code duplicated, block: B:85:0x028b A[DONT_INVERT, PHI: r3 r4 r5 r6 r8
  0x028b: PHI (r3v5 b24) = (r3v3 b24), (r3v7 b24) binds: [B:76:0x0233, B:84:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r4v4 long[]) = (r4v2 long[]), (r4v6 long[]) binds: [B:76:0x0233, B:84:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r5v4 int) = (r5v2 int), (r5v6 int) binds: [B:76:0x0233, B:84:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r6v2 int) = (r6v1 int), (r6v4 int) binds: [B:76:0x0233, B:84:0x0286] A[DONT_GENERATE, DONT_INLINE]
  0x028b: PHI (r8v4 r91) = (r8v2 r91), (r8v6 r91) binds: [B:76:0x0233, B:84:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x028d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006d -> B:22:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006f -> B:15:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:19:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0104 -> B:43:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0106 -> B:36:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011d -> B:40:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x019c -> B:64:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x019e -> B:57:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b5 -> B:61:0x01d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0233 -> B:85:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0235 -> B:78:0x0247). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x024d -> B:82:0x0281). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
