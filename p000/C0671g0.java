package p000;

import android.content.Context;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: g0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0671g0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19451t;

    /* JADX INFO: renamed from: u */
    public boolean f19452u;

    /* JADX INFO: renamed from: v */
    public Object f19453v;

    /* JADX INFO: renamed from: w */
    public Object f19454w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19455x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671g0(wm0 wm0Var, pn0 pn0Var, yp1 yp1Var, sn0 sn0Var) {
        super(2, wm0Var);
        this.f19451t = (byte) 17;
        this.f19453v = pn0Var;
        this.f19454w = yp1Var;
        this.f19455x = sn0Var;
    }

    /* JADX INFO: renamed from: i */
    private final Object m5866i(Object obj) {
        fh2 fh2Var = (fh2) this.f19453v;
        d83 d83Var = fh2Var.f18991j;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f19452u;
        byte b = 1;
        try {
            if (!z) {
                k43.m7376J(obj);
                C0910mi c0910mi = fh2Var.f18998q;
                Float f = new Float(0.0f);
                ag1 ag1Var = (ag1) this.f19454w;
                bu1 bu1Var = (bu1) this.f19455x;
                eh2 eh2Var = new eh2(b);
                eh2Var.f18090b = bu1Var;
                eh2Var.f18091c = fh2Var;
                VarHandle.storeStoreFence();
                this.f19452u = true;
                if (C0910mi.m8325a(c0910mi, f, ag1Var, eh2Var, this, 4) == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (!z) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
            fh2Var.f18992k.setValue(Boolean.TRUE);
            d83Var.setValue(Boolean.FALSE);
            return ju4.f22634a;
        } catch (Throwable th) {
            d83Var.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f19451t;
        Object obj2 = this.f19455x;
        switch (b) {
            case 0:
                return new C0671g0((nv2) this.f19453v, (ef3) this.f19454w, (w01) obj2, wm0Var, (byte) 0);
            case 1:
                return new C0671g0((mq1) this.f19453v, this.f19454w, (zo0) obj2, wm0Var, (byte) 1);
            case 2:
                C0671g0 c0671g0 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 2);
                c0671g0.f19453v = obj;
                return c0671g0;
            case 3:
                C0671g0 c0671g1 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 3);
                c0671g1.f19453v = obj;
                return c0671g1;
            case 4:
                C0671g0 c0671g2 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 4);
                c0671g2.f19453v = obj;
                return c0671g2;
            case 5:
                C0671g0 c0671g3 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 5);
                c0671g3.f19453v = obj;
                return c0671g3;
            case 6:
                C0671g0 c0671g4 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 6);
                c0671g4.f19453v = obj;
                return c0671g4;
            case 7:
                C0671g0 c0671g5 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 7);
                c0671g5.f19453v = obj;
                return c0671g5;
            case 8:
                return new C0671g0((mq1) this.f19453v, (Context) this.f19454w, (C1409zl) obj2, wm0Var, (byte) 8);
            case 9:
                return new C0671g0((nl1) this.f19453v, (sw2) this.f19454w, (co4) obj2, wm0Var, (byte) 9);
            case 10:
                C0671g0 c0671g6 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 10);
                c0671g6.f19453v = obj;
                return c0671g6;
            case 11:
                return new C0671g0((h30) this.f19453v, (e13) this.f19454w, (C0675g4) obj2, wm0Var, (byte) 11);
            case 12:
                C0671g0 c0671g7 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 12);
                c0671g7.f19453v = obj;
                return c0671g7;
            case 13:
                C0671g0 c0671g8 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 13);
                c0671g8.f19453v = obj;
                return c0671g8;
            case 14:
                return new C0671g0((wp1) this.f19453v, (C0910mi) this.f19454w, (lu2) obj2, wm0Var, (byte) 14);
            case 15:
                C0671g0 c0671g9 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 15);
                c0671g9.f19453v = obj;
                return c0671g9;
            case 16:
                return new C0671g0(this.f19454w, obj2, wm0Var, (byte) 16);
            case 17:
                return new C0671g0(wm0Var, (pn0) this.f19453v, (yp1) this.f19454w, (sn0) obj2);
            case 18:
                return new C0671g0((ru0) this.f19453v, (gh3) this.f19454w, (C1122rv) obj2, wm0Var, (byte) 18);
            case 19:
                C0671g0 c0671g10 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 19);
                c0671g10.f19453v = obj;
                return c0671g10;
            case 20:
                return new C0671g0((sw0) this.f19453v, (xw2) this.f19454w, (mq1) obj2, wm0Var, (byte) 20);
            case 21:
                return new C0671g0((nv2) this.f19453v, (tk1) this.f19454w, (w01) obj2, wm0Var, (byte) 21);
            case 22:
                C0671g0 c0671g11 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 22);
                c0671g11.f19453v = obj;
                return c0671g11;
            case 23:
                return new C0671g0((pz2) this.f19453v, (sp1) this.f19454w, (a83) obj2, wm0Var, (byte) 23);
            case 24:
                C0671g0 c0671g12 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 24);
                c0671g12.f19453v = obj;
                return c0671g12;
            case 25:
                C0671g0 c0671g13 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 25);
                c0671g13.f19453v = obj;
                return c0671g13;
            case 26:
                return new C0671g0((f40) obj2, wm0Var);
            case 27:
                return new C0671g0((mq1) this.f19453v, (wp1) this.f19454w, (yp1) obj2, wm0Var, (byte) 27);
            case 28:
                return new C0671g0((fh2) this.f19453v, (ag1) this.f19454w, (bu1) obj2, wm0Var, (byte) 28);
            default:
                C0671g0 c0671g14 = new C0671g0(this.f19454w, obj2, wm0Var, (byte) 29);
                c0671g14.f19453v = obj;
                return c0671g14;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f19451t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C0671g0) create((wm0) obj2, (uv0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0671g0) create((wm0) obj2, (l73) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0671g0) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0671g0) create((wm0) obj2, (C0766im) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C0671g0) create((wm0) obj2, (String) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((C0671g0) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                ((C0671g0) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 16:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 17:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 18:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 19:
                return ((C0671g0) create((wm0) obj2, (tx3) obj)).invokeSuspend(ju4Var);
            case 20:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 21:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 22:
                return ((C0671g0) create((wm0) obj2, (kr3) obj)).invokeSuspend(ju4Var);
            case 23:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 24:
                return ((C0671g0) create((wm0) obj2, (ag0) obj)).invokeSuspend(ju4Var);
            case 25:
                return ((C0671g0) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
            case 26:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 27:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 28:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0671g0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00cb */
    /* JADX WARN: Code duplicated, block: B:204:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:222:0x042c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0640  */
    /* JADX WARN: Code duplicated, block: B:488:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[Catch: all -> 0x00cb, TryCatch #6 {, blocks: (B:52:0x00c5, B:62:0x00ee, B:64:0x00f6, B:65:0x0103, B:72:0x0113, B:59:0x00e0, B:74:0x0116, B:76:0x011b, B:77:0x011c, B:58:0x00dc, B:66:0x0104, B:68:0x010a), top: B:490:0x00b9, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010a A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #5 {all -> 0x011a, blocks: (B:66:0x0104, B:68:0x010a), top: B:488:0x0104, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0116 A[Catch: all -> 0x00cb, TryCatch #6 {, blocks: (B:52:0x00c5, B:62:0x00ee, B:64:0x00f6, B:65:0x0103, B:72:0x0113, B:59:0x00e0, B:74:0x0116, B:76:0x011b, B:77:0x011c, B:58:0x00dc, B:66:0x0104, B:68:0x010a), top: B:490:0x00b9, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:68:0x010a, B:71:0x0112], limit reached: 554 */
    /* JADX WARN: Type inference failed for: r7v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00ea -> B:62:0x00ee). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0671g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671g0(f40 f40Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19451t = (byte) 26;
        this.f19455x = f40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0671g0(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f19451t = b;
        this.f19454w = obj;
        this.f19455x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0671g0(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f19451t = b;
        this.f19453v = obj;
        this.f19454w = obj2;
        this.f19455x = obj3;
    }
}
