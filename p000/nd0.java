package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public /* synthetic */ Object f25691A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ si1[] f25692B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C0898m6 f25693C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ y24 f25694D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ti1 f25695E;

    /* JADX INFO: renamed from: t */
    public Object[] f25696t;

    /* JADX INFO: renamed from: u */
    public b80 f25697u;

    /* JADX INFO: renamed from: v */
    public byte[] f25698v;

    /* JADX INFO: renamed from: w */
    public int f25699w;

    /* JADX INFO: renamed from: x */
    public int f25700x;

    /* JADX INFO: renamed from: y */
    public int f25701y;

    /* JADX INFO: renamed from: z */
    public byte f25702z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd0(si1[] si1VarArr, C0898m6 c0898m6, y24 y24Var, ti1 ti1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f25692B = si1VarArr;
        this.f25693C = c0898m6;
        this.f25694D = y24Var;
        this.f25695E = ti1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        nd0 nd0Var = new nd0(this.f25692B, this.f25693C, this.f25694D, this.f25695E, wm0Var);
        nd0Var.f25691A = obj;
        return nd0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((nd0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[DONT_INVERT, EDGE_INSN: B:34:0x00bb->B:20:0x0078 BREAK  A[LOOP:0: B:27:0x009c->B:40:?]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:27:0x009c->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:20:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
