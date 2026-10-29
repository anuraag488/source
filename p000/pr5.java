package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum pr5 {
    f27923b(-999),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(-3),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(-2),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF53(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF63(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF80(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF92(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF101(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF110(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF119(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF133(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF146(12);


    /* JADX INFO: renamed from: c */
    public static final jm3 f27924c;

    /* JADX INFO: renamed from: a */
    public final int f27926a;

    static {
        C0795je c0795je = new C0795je((byte) 9);
        c0795je.f22194c = new Object[8];
        c0795je.f22193b = 0;
        for (pr5 pr5Var : values()) {
            Integer numValueOf = Integer.valueOf(pr5Var.f27926a);
            int i = c0795je.f22193b + 1;
            Object[] objArrCopyOf = (Object[]) c0795je.f22194c;
            int length = objArrCopyOf.length;
            int i2 = i + i;
            if (i2 > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, qu5.m10125a(length, i2));
                c0795je.f22194c = objArrCopyOf;
            }
            int i3 = c0795je.f22193b;
            int i4 = i3 + i3;
            objArrCopyOf[i4] = numValueOf;
            objArrCopyOf[i4 + 1] = pr5Var;
            c0795je.f22193b = i3 + 1;
        }
        vv5 vv5Var = (vv5) c0795je.f22195d;
        if (vv5Var != null) {
            throw vv5Var.m11997a();
        }
        jm3 jm3VarM7186c = jm3.m7186c(c0795je.f22193b, (Object[]) c0795je.f22194c, c0795je);
        vv5 vv5Var2 = (vv5) c0795je.f22195d;
        if (vv5Var2 != null) {
            throw vv5Var2.m11997a();
        }
        f27924c = jm3VarM7186c;
    }

    pr5(int i) {
        this.f27926a = i;
    }
}
