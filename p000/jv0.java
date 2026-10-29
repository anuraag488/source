package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Set f22641a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f22642b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set f22643c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f22644d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f22645e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ ny2 f22646f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.ArrayList] */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        ?? M6319e1;
        Set set = this.f22641a;
        Object obj5 = this.f22642b;
        Set set2 = this.f22643c;
        sw2 sw2Var = this.f22644d;
        List list = this.f22645e;
        ny2 ny2Var = this.f22646f;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zM6894i = ir1Var.m6894i(set) | ir1Var.m6894i(obj5) | ir1Var.m6894i(set2) | ir1Var.m6890g(sw2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj4 = objM6869O;
                C0762ii c0762ii = new C0762ii((byte) 3);
                c0762ii.f21430b = set;
                c0762ii.f21431c = obj5;
                c0762ii.f21432d = set2;
                c0762ii.f21433e = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0762ii);
                obj4 = c0762ii;
            }
            obj4 = objM6869O;
            lb5.m7923d(obj5, (yp1) obj4, ir1Var);
            ir1Var.m6885d0(358947325);
            if (list instanceof RandomAccess) {
                mw2 mw2Var = new mw2(list.size());
                M6319e1 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj6 = list.get(i);
                    if (mw2Var.m8409a(obj6)) {
                        M6319e1.add(obj6);
                    }
                }
            } else {
                M6319e1 = hb0.m6319e1(hb0.m6321g1(list));
            }
            if (!M6319e1.isEmpty()) {
                ListIterator listIterator = M6319e1.listIterator(M6319e1.size());
                ny2Var = ny2Var;
                while (listIterator.hasPrevious()) {
                    oy2 oy2Var = (oy2) listIterator.previous();
                    up4 up4Var = new up4((byte) 4);
                    up4Var.f32065b = oy2Var;
                    up4Var.f32066c = ny2Var;
                    VarHandle.storeStoreFence();
                    ny2Var = new ny2(ny2Var, vd6.m11834R(-330823412, up4Var, ir1Var));
                }
            }
            ir1Var.m6912r(false);
            ny2Var.m8898a(0, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
