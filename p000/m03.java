package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m03 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f24517a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ m03[] f24518b;

    /* JADX INFO: Fake field, exist only in values array */
    m03 EF1;

    static {
        m03 m03Var = new m03("MOBILE", 0);
        m03 m03Var2 = new m03("WIFI", 1);
        m03 m03Var3 = new m03("MOBILE_MMS", 2);
        m03 m03Var4 = new m03("MOBILE_SUPL", 3);
        m03 m03Var5 = new m03("MOBILE_DUN", 4);
        m03 m03Var6 = new m03("MOBILE_HIPRI", 5);
        m03 m03Var7 = new m03("WIMAX", 6);
        m03 m03Var8 = new m03("BLUETOOTH", 7);
        m03 m03Var9 = new m03("DUMMY", 8);
        m03 m03Var10 = new m03("ETHERNET", 9);
        m03 m03Var11 = new m03("MOBILE_FOTA", 10);
        m03 m03Var12 = new m03("MOBILE_IMS", 11);
        m03 m03Var13 = new m03("MOBILE_CBS", 12);
        m03 m03Var14 = new m03("WIFI_P2P", 13);
        m03 m03Var15 = new m03("MOBILE_IA", 14);
        m03 m03Var16 = new m03("MOBILE_EMERGENCY", 15);
        m03 m03Var17 = new m03("PROXY", 16);
        m03 m03Var18 = new m03("VPN", 17);
        m03 m03Var19 = new m03("NONE", 18);
        f24518b = new m03[]{m03Var, m03Var2, m03Var3, m03Var4, m03Var5, m03Var6, m03Var7, m03Var8, m03Var9, m03Var10, m03Var11, m03Var12, m03Var13, m03Var14, m03Var15, m03Var16, m03Var17, m03Var18, m03Var19};
        SparseArray sparseArray = new SparseArray();
        f24517a = sparseArray;
        sparseArray.put(0, m03Var);
        sparseArray.put(1, m03Var2);
        sparseArray.put(2, m03Var3);
        sparseArray.put(3, m03Var4);
        sparseArray.put(4, m03Var5);
        sparseArray.put(5, m03Var6);
        sparseArray.put(6, m03Var7);
        sparseArray.put(7, m03Var8);
        sparseArray.put(8, m03Var9);
        sparseArray.put(9, m03Var10);
        sparseArray.put(10, m03Var11);
        sparseArray.put(11, m03Var12);
        sparseArray.put(12, m03Var13);
        sparseArray.put(13, m03Var14);
        sparseArray.put(14, m03Var15);
        sparseArray.put(15, m03Var16);
        sparseArray.put(16, m03Var17);
        sparseArray.put(17, m03Var18);
        sparseArray.put(-1, m03Var19);
    }

    public static m03 valueOf(String str) {
        return (m03) Enum.valueOf(m03.class, str);
    }

    public static m03[] values() {
        return (m03[]) f24518b.clone();
    }
}
