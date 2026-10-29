package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz0 {

    /* JADX INFO: renamed from: a */
    public static final String f22751a = wn2.m12327g("DiagnosticsWrkr");

    /* JADX INFO: renamed from: a */
    public static final String m7344a(l25 l25Var, w25 w25Var, kg4 kg4Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q25 q25Var = (q25) it.next();
            e25 e25VarM7904L = lb5.m7904L(q25Var);
            String str = q25Var.f28162a;
            ig4 ig4VarM7515a = kg4Var.m7515a(e25VarM7904L);
            Integer numValueOf = ig4VarM7515a != null ? Integer.valueOf(ig4VarM7515a.f21410c) : null;
            WorkDatabase workDatabase = l25Var.f23750a;
            C1051py c1051py = new C1051py((byte) 10);
            c1051py.f28076b = str;
            VarHandle.storeStoreFence();
            String strM6305Q0 = hb0.m6305Q0((List) as4.m3231J(workDatabase, true, false, c1051py), ",", null, null, 0, null, 62);
            WorkDatabase workDatabase2 = w25Var.f33049a;
            C1051py c1051py2 = new C1051py((byte) 23);
            c1051py2.f28076b = str;
            VarHandle.storeStoreFence();
            String strM6305Q1 = hb0.m6305Q0((List) as4.m3231J(workDatabase2, true, false, c1051py2), ",", null, null, 0, null, 62);
            String str2 = q25Var.f28164c;
            String strName = q25Var.f28163b.name();
            StringBuilder sbM13625y = zi4.m13625y("\n", str, "\t ", str2, "\t ");
            sbM13625y.append(numValueOf);
            sbM13625y.append("\t ");
            sbM13625y.append(strName);
            sbM13625y.append("\t ");
            sb.append(c75.m3882n(sbM13625y, strM6305Q0, "\t ", strM6305Q1, "\t"));
        }
        return sb.toString();
    }
}
