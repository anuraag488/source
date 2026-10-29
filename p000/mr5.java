package p000;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mr5 {

    /* JADX INFO: renamed from: f */
    public static final mr5 f25170f = new mr5((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a */
    public final int f25171a;

    /* JADX INFO: renamed from: b */
    public final String f25172b;

    /* JADX INFO: renamed from: c */
    public final Boolean f25173c;

    /* JADX INFO: renamed from: d */
    public final String f25174d;

    /* JADX INFO: renamed from: e */
    public final EnumMap f25175e;

    public mr5(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(vc6.class);
        this.f25175e = enumMap;
        enumMap.put(vc6.AD_USER_DATA, bool == null ? rc6.UNINITIALIZED : bool.booleanValue() ? rc6.GRANTED : rc6.DENIED);
        this.f25171a = i;
        this.f25172b = m8389d();
        this.f25173c = bool2;
        this.f25174d = str;
    }

    /* JADX INFO: renamed from: b */
    public static mr5 m8386b(String str) {
        if (str == null || str.length() <= 0) {
            return f25170f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(vc6.class);
        vc6[] vc6VarArr = tc6.DMA.f31080a;
        int length = vc6VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(vc6VarArr[i3], xc6.m12655e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new mr5(enumMap, i, (Boolean) null, (String) null);
    }

    /* JADX INFO: renamed from: c */
    public static mr5 m8387c(int i, Bundle bundle) {
        if (bundle == null) {
            return new mr5((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(vc6.class);
        for (vc6 vc6Var : tc6.DMA.f31080a) {
            enumMap.put(vc6Var, xc6.m12654d(bundle.getString(vc6Var.f32527a)));
        }
        return new mr5(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    /* JADX INFO: renamed from: a */
    public final rc6 m8388a() {
        rc6 rc6Var = (rc6) this.f25175e.get(vc6.AD_USER_DATA);
        return rc6Var == null ? rc6.UNINITIALIZED : rc6Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m8389d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25171a);
        for (vc6 vc6Var : tc6.DMA.f31080a) {
            sb.append(":");
            sb.append(xc6.m12656h((rc6) this.f25175e.get(vc6Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mr5)) {
            return false;
        }
        mr5 mr5Var = (mr5) obj;
        if (this.f25172b.equalsIgnoreCase(mr5Var.f25172b) && Objects.equals(this.f25173c, mr5Var.f25173c)) {
            return Objects.equals(this.f25174d, mr5Var.f25174d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.f25173c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f25174d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f25172b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(xc6.m12651a(this.f25171a));
        for (vc6 vc6Var : tc6.DMA.f31080a) {
            sb.append(",");
            sb.append(vc6Var.f32527a);
            sb.append("=");
            rc6 rc6Var = (rc6) this.f25175e.get(vc6Var);
            if (rc6Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = rc6Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f25173c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f25174d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public mr5(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(vc6.class);
        this.f25175e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f25171a = i;
        this.f25172b = m8389d();
        this.f25173c = bool;
        this.f25174d = str;
    }
}
