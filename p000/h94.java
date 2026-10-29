package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h94 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public long[] f20450u;

    /* JADX INFO: renamed from: v */
    public int f20451v;

    /* JADX INFO: renamed from: w */
    public int f20452w;

    /* JADX INFO: renamed from: x */
    public byte f20453x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f20454y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ i94 f20455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h94(i94 i94Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20455z = i94Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        h94 h94Var = new h94(this.f20455z, wm0Var);
        h94Var.f20454y = obj;
        return h94Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((h94) create((wm0) obj2, (b24) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:26:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h94.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
