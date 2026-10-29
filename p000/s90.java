package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s90 {

    /* JADX INFO: renamed from: a */
    public String f29998a;

    /* JADX INFO: renamed from: b */
    public List f29999b;

    /* JADX INFO: renamed from: c */
    public ArrayList f30000c;

    /* JADX INFO: renamed from: d */
    public HashSet f30001d;

    /* JADX INFO: renamed from: e */
    public ArrayList f30002e;

    /* JADX INFO: renamed from: f */
    public ArrayList f30003f;

    /* JADX INFO: renamed from: g */
    public ArrayList f30004g;

    /* JADX INFO: renamed from: a */
    public static void m10563a(s90 s90Var, String str, fa2 fa2Var) {
        if (!s90Var.f30001d.add(str)) {
            StringBuilder sbM10844j = sk5.m10844j("Element with name '", str, "' is already registered in ");
            sbM10844j.append(s90Var.f29998a);
            throw new IllegalArgumentException(sbM10844j.toString().toString());
        }
        s90Var.f30000c.add(str);
        s90Var.f30002e.add(fa2Var);
        s90Var.f30003f.add(v71.f32439a);
        s90Var.f30004g.add(false);
    }
}
