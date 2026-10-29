package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ow2 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public int f27164A;

    /* JADX INFO: renamed from: B */
    public long f27165B;

    /* JADX INFO: renamed from: C */
    public boolean f27166C;

    /* JADX INFO: renamed from: D */
    public /* synthetic */ Object f27167D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ pw2 f27168E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ xf1 f27169F;

    /* JADX INFO: renamed from: u */
    public xf1 f27170u;

    /* JADX INFO: renamed from: v */
    public pw2 f27171v;

    /* JADX INFO: renamed from: w */
    public long[] f27172w;

    /* JADX INFO: renamed from: x */
    public int f27173x;

    /* JADX INFO: renamed from: y */
    public int f27174y;

    /* JADX INFO: renamed from: z */
    public int f27175z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow2(pw2 pw2Var, xf1 xf1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27168E = pw2Var;
        this.f27169F = xf1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        ow2 ow2Var = new ow2(this.f27168E, this.f27169F, wm0Var);
        ow2Var.f27167D = obj;
        return ow2Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ow2) create((wm0) obj2, (b24) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006f -> B:19:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            ap0 r1 = p000.ap0.f14763a
            boolean r2 = r0.f27166C
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2e
            if (r2 != r5) goto L27
            int r2 = r0.f27164A
            int r6 = r0.f27175z
            long r7 = r0.f27165B
            int r9 = r0.f27174y
            int r10 = r0.f27173x
            long[] r11 = r0.f27172w
            pw2 r12 = r0.f27171v
            xf1 r13 = r0.f27170u
            java.lang.Object r14 = r0.f27167D
            b24 r14 = (p000.b24) r14
            p000.k43.m7376J(r22)
            goto L96
        L27:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r0)
            r0 = 0
            return r0
        L2e:
            p000.k43.m7376J(r22)
            java.lang.Object r2 = r0.f27167D
            b24 r2 = (p000.b24) r2
            pw2 r6 = r0.f27168E
            mw2 r7 = r6.f28049b
            long[] r7 = r7.f25257a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            xf1 r9 = r0.f27169F
            r10 = r3
        L43:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L66:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.f34223c = r3
            mw2 r4 = r12.f28049b
            java.lang.Object[] r4 = r4.f25258b
            r3 = r4[r3]
            r0.f27167D = r14
            r0.f27170u = r13
            r0.f27171v = r12
            r0.f27172w = r11
            r0.f27173x = r10
            r0.f27174y = r9
            r0.f27165B = r7
            r0.f27175z = r6
            r0.f27164A = r2
            r0.f27166C = r5
            r14.m3411c(r3, r0)
            ap0 r0 = p000.ap0.f14763a
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L66
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L43
        La6:
            ju4 r0 = p000.ju4.f22634a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ow2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
