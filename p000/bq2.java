package p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 extends uq4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15503a = 0;

    /* JADX INFO: renamed from: b */
    public Object f15504b;

    /* JADX INFO: renamed from: c */
    public uq4 f15505c;

    /* JADX INFO: renamed from: d */
    public Object f15506d;

    public bq2(ou1 ou1Var, uq4 uq4Var, Type type) {
        this.f15504b = ou1Var;
        this.f15505c = uq4Var;
        this.f15506d = type;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        switch (this.f15503a) {
            case 0:
                int iMo7481R = kb2Var.mo7481R();
                if (iMo7481R == 9) {
                    kb2Var.mo7477N();
                    return null;
                }
                Map map = (Map) ((l23) this.f15506d).mo7823g();
                if (iMo7481R == 1) {
                    kb2Var.mo7490a();
                    while (kb2Var.mo7501v()) {
                        kb2Var.mo7490a();
                        Object objMo166b = ((bq2) this.f15504b).f15505c.mo166b(kb2Var);
                        if (map.put(objMo166b, ((bq2) this.f15505c).f15505c.mo166b(kb2Var)) != null) {
                            throw new lb2("duplicate key: " + objMo166b);
                        }
                        kb2Var.mo7495j();
                    }
                    kb2Var.mo7495j();
                } else {
                    kb2Var.mo7492b();
                    while (kb2Var.mo7501v()) {
                        r50.f29018b.getClass();
                        if (kb2Var instanceof ub2) {
                            ub2 ub2Var = (ub2) kb2Var;
                            ub2Var.m11523b0(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) ub2Var.m11527f0()).next();
                            ub2Var.m11529h0(entry.getValue());
                            ub2Var.m11529h0(new gb2((String) entry.getKey()));
                        } else {
                            int iM7494g = kb2Var.f23047g;
                            if (iM7494g == 0) {
                                iM7494g = kb2Var.m7494g();
                            }
                            if (iM7494g == 13) {
                                kb2Var.f23047g = 9;
                            } else if (iM7494g == 12) {
                                kb2Var.f23047g = 8;
                            } else {
                                if (iM7494g != 14) {
                                    throw kb2Var.m7491a0("a name");
                                }
                                kb2Var.f23047g = 10;
                            }
                        }
                        Object objMo166b2 = ((bq2) this.f15504b).f15505c.mo166b(kb2Var);
                        if (map.put(objMo166b2, ((bq2) this.f15505c).f15505c.mo166b(kb2Var)) != null) {
                            throw new lb2("duplicate key: " + objMo166b2);
                        }
                    }
                    kb2Var.mo7496k();
                }
                return map;
            default:
                return this.f15505c.mo166b(kb2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        uq4 uq4VarMo8484d;
        switch (this.f15503a) {
            case 0:
                Map map = (Map) obj;
                bq2 bq2Var = (bq2) this.f15505c;
                if (map == null) {
                    yb2Var.mo12211t();
                } else {
                    yb2Var.mo12207e();
                    for (Map.Entry entry : map.entrySet()) {
                        yb2Var.mo12210l(String.valueOf(entry.getKey()));
                        bq2Var.mo167c(yb2Var, entry.getValue());
                    }
                    yb2Var.mo12209k();
                }
                break;
            default:
                uq4 uq4Var = this.f15505c;
                Type type = (Type) this.f15506d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    uq4 uq4VarM9271d = ((ou1) this.f15504b).m9271d(new cs4(type2));
                    if (uq4VarM9271d instanceof xl3) {
                        uq4 uq4Var2 = uq4Var;
                        while ((uq4Var2 instanceof n24) && (uq4VarMo8484d = ((n24) uq4Var2).mo8484d()) != uq4Var2) {
                            uq4Var2 = uq4VarMo8484d;
                        }
                        if (uq4Var2 instanceof xl3) {
                            uq4Var = uq4VarM9271d;
                        }
                    } else {
                        uq4Var = uq4VarM9271d;
                    }
                }
                uq4Var.mo167c(yb2Var, obj);
                break;
        }
    }

    public /* synthetic */ bq2() {
    }
}
