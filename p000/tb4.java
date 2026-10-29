package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tb4 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public byte f31061t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ ti1 f31062u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ int f31063v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ub4 f31064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb4(ub4 ub4Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f31064w = ub4Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        tb4 tb4Var = new tb4(this.f31064w, (wm0) obj3);
        tb4Var.f31062u = (ti1) obj;
        tb4Var.f31063v = iIntValue;
        return tb4Var.invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L32;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j54 j54Var;
        ti1 ti1Var = this.f31062u;
        int i = this.f31063v;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31061t;
        if (b == 0) {
            k43.m7376J(obj);
            if (i > 0) {
                j54 j54Var2 = j54.f22029a;
                this.f31062u = null;
                this.f31063v = i;
                this.f31061t = (byte) 1;
            } else {
                this.f31062u = ti1Var;
                this.f31063v = i;
                this.f31061t = (byte) 2;
                if (d24.m4317r(0L, this) != ap0Var) {
                    j54Var = j54.f22030b;
                    this.f31062u = ti1Var;
                    this.f31063v = i;
                    this.f31061t = (byte) 3;
                    if (ti1Var.emit(j54Var, this) != ap0Var) {
                        this.f31062u = ti1Var;
                        this.f31063v = i;
                        this.f31061t = (byte) 4;
                        if (d24.m4317r(Long.MAX_VALUE, this) != ap0Var) {
                            j54 j54Var3 = j54.f22031c;
                            this.f31062u = null;
                            this.f31063v = i;
                            this.f31061t = (byte) 5;
                        }
                    }
                }
            }
            return ap0Var;
        }
        if (b != 1) {
            if (b == 2) {
                k43.m7376J(obj);
                j54Var = j54.f22030b;
                this.f31062u = ti1Var;
                this.f31063v = i;
                this.f31061t = (byte) 3;
                if (ti1Var.emit(j54Var, this) != ap0Var) {
                    this.f31062u = ti1Var;
                    this.f31063v = i;
                    this.f31061t = (byte) 4;
                    if (d24.m4317r(Long.MAX_VALUE, this) != ap0Var) {
                    }
                }
                return ap0Var;
            }
            if (b == 3) {
                k43.m7376J(obj);
                this.f31062u = ti1Var;
                this.f31063v = i;
                this.f31061t = (byte) 4;
                if (d24.m4317r(Long.MAX_VALUE, this) != ap0Var) {
                }
                return ap0Var;
            }
            if (b == 4) {
                k43.m7376J(obj);
            } else if (b != 5) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j54 j54Var4 = j54.f22031c;
            this.f31062u = null;
            this.f31063v = i;
            this.f31061t = (byte) 5;
        }
        k43.m7376J(obj);
        return ju4.f22634a;
    }
}
