package p000;

/* JADX INFO: renamed from: ud */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1215ud extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f31787u;

    /* JADX INFO: renamed from: v */
    public byte f31788v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f31789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f31790x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1215ud(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31787u = b;
        this.f31790x = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f31787u;
        Object obj2 = this.f31790x;
        switch (b) {
            case 0:
                C1215ud c1215ud = new C1215ud((C1289wd) obj2, wm0Var, (byte) 0);
                c1215ud.f31789w = obj;
                return c1215ud;
            case 1:
                C1215ud c1215ud2 = new C1215ud((lv1) obj2, wm0Var, (byte) 1);
                c1215ud2.f31789w = obj;
                return c1215ud2;
            case 2:
                C1215ud c1215ud3 = new C1215ud((yp1) obj2, wm0Var, (byte) 2);
                c1215ud3.f31789w = obj;
                return c1215ud3;
            default:
                C1215ud c1215ud4 = new C1215ud((nh4) obj2, wm0Var, (byte) 3);
                c1215ud4.f31789w = obj;
                return c1215ud4;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31787u;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1215ud) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4Var);
            case 1:
                ((C1215ud) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 2:
                return ((C1215ud) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4Var);
            default:
                ((C1215ud) create((wm0) obj2, (yc2) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[LOOP:1: B:75:0x01c6->B:79:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x01de A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:19:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0133 -> B:52:0x0137). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0195 -> B:68:0x0199). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1215ud.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
