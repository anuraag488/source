package p000;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0594e0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f17548t;

    /* JADX INFO: renamed from: u */
    public boolean f17549u;

    /* JADX INFO: renamed from: v */
    public Object f17550v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f17551w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594e0(wv0 wv0Var, C1031pe c1031pe, wm0 wm0Var) {
        super(2, wm0Var);
        this.f17548t = (byte) 26;
        xw2 xw2Var = xw2.f34665a;
        this.f17550v = wv0Var;
        this.f17551w = c1031pe;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f17548t;
        Object obj2 = this.f17551w;
        switch (b) {
            case 0:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 0);
            case 1:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 1);
            case 2:
                C0594e0 c0594e0 = new C0594e0(obj2, wm0Var, (byte) 2);
                c0594e0.f17550v = obj;
                return c0594e0;
            case 3:
                C0594e0 c0594e1 = new C0594e0(obj2, wm0Var, (byte) 3);
                c0594e1.f17550v = obj;
                return c0594e1;
            case 4:
                return new C0594e0(wm0Var, this.f17550v, obj2, (byte) 4);
            case 5:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 5);
            case 6:
                C0594e0 c0594e2 = new C0594e0(obj2, wm0Var, (byte) 6);
                c0594e2.f17550v = obj;
                return c0594e2;
            case 7:
                C0594e0 c0594e3 = new C0594e0(obj2, wm0Var, (byte) 7);
                c0594e3.f17550v = obj;
                return c0594e3;
            case 8:
                C0594e0 c0594e4 = new C0594e0(obj2, wm0Var, (byte) 8);
                c0594e4.f17550v = obj;
                return c0594e4;
            case 9:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 9);
            case 10:
                return new C0594e0(wm0Var, this.f17550v, obj2, (byte) 10);
            case 11:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 11);
            case 12:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 12);
            case 13:
                C0594e0 c0594e5 = new C0594e0(obj2, wm0Var, (byte) 13);
                c0594e5.f17550v = obj;
                return c0594e5;
            case 14:
                C0594e0 c0594e6 = new C0594e0(obj2, wm0Var, (byte) 14);
                c0594e6.f17550v = obj;
                return c0594e6;
            case 15:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 15);
            case 16:
                return new C0594e0(obj2, wm0Var, (byte) 16);
            case 17:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 17);
            case 18:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 18);
            case 19:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 19);
            case 20:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 20);
            case 21:
                C0594e0 c0594e7 = new C0594e0(obj2, wm0Var, (byte) 21);
                c0594e7.f17550v = obj;
                return c0594e7;
            case 22:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 22);
            case 23:
                C0594e0 c0594e8 = new C0594e0(obj2, wm0Var, (byte) 23);
                c0594e8.f17550v = obj;
                return c0594e8;
            case 24:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 24);
            case 25:
                C0594e0 c0594e9 = new C0594e0(obj2, wm0Var, (byte) 25);
                c0594e9.f17550v = obj;
                return c0594e9;
            case 26:
                wv0 wv0Var = (wv0) this.f17550v;
                xw2 xw2Var = xw2.f34665a;
                return new C0594e0(wv0Var, (C1031pe) obj2, wm0Var);
            case 27:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 27);
            case 28:
                return new C0594e0(this.f17550v, obj2, wm0Var, (byte) 28);
            default:
                return new C0594e0(this.f17550v, wm0Var, (sw2) obj2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f17548t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                ((C0594e0) create((wm0) obj2, (a42) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 3:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0594e0) create((wm0) obj2, (b12) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C0594e0) create((wm0) obj2, (yp1) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C0594e0) create((wm0) obj2, (mg3) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((C0594e0) create((wm0) obj2, (mg3) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((C0594e0) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
            case 15:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 16:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 17:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 18:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 19:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 20:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 21:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 22:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 23:
                return ((C0594e0) create((wm0) obj2, (qt0) obj)).invokeSuspend(ju4Var);
            case 24:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 25:
                return ((C0594e0) create((wm0) obj2, (ks2) obj)).invokeSuspend(ju4Var);
            case 26:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 27:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 28:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0594e0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:357:0x077e  */
    /* JADX WARN: Code duplicated, block: B:359:0x0797  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:362:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:366:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [i73] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0594e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594e0(wm0 wm0Var, Object obj, Object obj2, byte b) {
        super(2, wm0Var);
        this.f17548t = b;
        this.f17550v = obj;
        this.f17551w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594e0(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f17548t = b;
        this.f17551w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0594e0(Object obj, wm0 wm0Var, sw2 sw2Var) {
        super(2, wm0Var);
        this.f17548t = (byte) 29;
        this.f17550v = obj;
        this.f17551w = sw2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0594e0(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f17548t = b;
        this.f17550v = obj;
        this.f17551w = obj2;
    }
}
