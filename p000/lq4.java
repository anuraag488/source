package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lq4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ w23[] f24282A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ mq4 f24283B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ cf4 f24284C;

    /* JADX INFO: renamed from: t */
    public w23[] f24285t;

    /* JADX INFO: renamed from: u */
    public mq4 f24286u;

    /* JADX INFO: renamed from: v */
    public cf4 f24287v;

    /* JADX INFO: renamed from: w */
    public int f24288w;

    /* JADX INFO: renamed from: x */
    public int f24289x;

    /* JADX INFO: renamed from: y */
    public int f24290y;

    /* JADX INFO: renamed from: z */
    public byte f24291z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq4(w23[] w23VarArr, mq4 mq4Var, cf4 cf4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24282A = w23VarArr;
        this.f24283B = mq4Var;
        this.f24284C = cf4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new lq4(this.f24282A, this.f24283B, this.f24284C, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((lq4) create((wm0) obj2, (af4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:26:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ap0 r0 = p000.ap0.f14763a
            byte r1 = r11.f24291z
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto Ld
            if (r1 != r3) goto L1d
        Ld:
            int r1 = r11.f24290y
            int r5 = r11.f24289x
            int r6 = r11.f24288w
            cf4 r7 = r11.f24287v
            mq4 r8 = r11.f24286u
            w23[] r9 = r11.f24285t
            p000.k43.m7376J(r12)
            goto L57
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r11)
            return r2
        L23:
            p000.k43.m7376J(r12)
            w23[] r12 = r11.f24282A
            int r1 = r12.length
            r5 = 0
            mq4 r6 = r11.f24283B
            cf4 r7 = r11.f24284C
            r9 = r12
            r12 = r5
            r8 = r6
        L31:
            if (r5 >= r1) goto L75
            r6 = r9[r5]
            int r10 = r12 + 1
            int r6 = r6.ordinal()
            if (r6 == 0) goto L72
            if (r6 == r4) goto L5d
            if (r6 != r3) goto L59
            r11.f24285t = r9
            r11.f24286u = r8
            r11.f24287v = r7
            r11.f24288w = r10
            r11.f24289x = r5
            r11.f24290y = r1
            r11.f24291z = r3
            java.lang.Object r12 = r8.m8375g(r7, r12, r11)
            if (r12 != r0) goto L56
            goto L71
        L56:
            r6 = r10
        L57:
            r12 = r6
            goto L73
        L59:
            p000.C0670g.m5864c()
            return r2
        L5d:
            r11.f24285t = r9
            r11.f24286u = r8
            r11.f24287v = r7
            r11.f24288w = r10
            r11.f24289x = r5
            r11.f24290y = r1
            r11.f24291z = r4
            java.lang.Object r12 = r8.m8374f(r7, r12, r11)
            if (r12 != r0) goto L56
        L71:
            return r0
        L72:
            r12 = r10
        L73:
            int r5 = r5 + r4
            goto L31
        L75:
            ju4 r11 = p000.ju4.f22634a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
