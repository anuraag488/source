package p000;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1348xy extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public fc3 f34707u;

    /* JADX INFO: renamed from: v */
    public boolean f34708v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f34709w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zo0 f34710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ co4 f34711y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1348xy(zo0 zo0Var, co4 co4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f34710x = zo0Var;
        this.f34711y = co4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        C1348xy c1348xy = new C1348xy(this.f34710x, this.f34711y, wm0Var);
        c1348xy.f34709w = obj;
        return c1348xy;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        ((C1348xy) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
        return ap0.f14763a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f34709w
            uf4 r0 = (p000.uf4) r0
            ap0 r1 = p000.ap0.f14763a
            boolean r2 = r8.f34708v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1a
            if (r2 != r4) goto L14
            fc3 r2 = r8.f34707u
            p000.k43.m7376J(r9)
            goto L2d
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r8)
            return r3
        L1a:
            p000.k43.m7376J(r9)
            fc3 r9 = p000.fc3.f18904b
            r2 = r9
        L20:
            r8.f34709w = r0
            r8.f34707u = r2
            r8.f34708v = r4
            java.lang.Object r9 = r0.m11538a(r2, r8)
            if (r9 != r1) goto L2d
            return r1
        L2d:
            ec3 r9 = (p000.ec3) r9
            java.util.List r5 = r9.f18000a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            lc3 r5 = (p000.lc3) r5
            int r5 = r5.f23943i
            r6 = 2
            if (r5 != r6) goto L20
            int r9 = r9.f18005f
            r5 = 4
            co4 r7 = r8.f34711y
            if (r9 != r5) goto L50
            ry r9 = new ry
            r9.<init>(r7, r3, r6)
            r5 = 3
            zo0 r6 = r8.f34710x
            p000.lb5.m7910S(r6, r3, r3, r9, r5)
            goto L20
        L50:
            r5 = 5
            if (r9 != r5) goto L20
            r7.getClass()
            r7.m4053a()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1348xy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
