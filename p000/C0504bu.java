package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: bu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0504bu {

    /* JADX INFO: renamed from: f */
    public static final C0504bu f15597f;

    /* JADX INFO: renamed from: a */
    public long f15598a;

    /* JADX INFO: renamed from: b */
    public int f15599b;

    /* JADX INFO: renamed from: c */
    public int f15600c;

    /* JADX INFO: renamed from: d */
    public long f15601d;

    /* JADX INFO: renamed from: e */
    public int f15602e;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l2 = 604800000L;
        Integer num3 = 81920;
        if (!"".isEmpty()) {
            C1077qn.m9989o("Missing required properties:".concat(""));
            return;
        }
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        long jLongValue2 = l2.longValue();
        int iIntValue3 = num3.intValue();
        C0504bu c0504bu = new C0504bu();
        c0504bu.f15598a = jLongValue;
        c0504bu.f15599b = iIntValue;
        c0504bu.f15600c = iIntValue2;
        c0504bu.f15601d = jLongValue2;
        c0504bu.f15602e = iIntValue3;
        VarHandle.storeStoreFence();
        f15597f = c0504bu;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0504bu) {
            C0504bu c0504bu = (C0504bu) obj;
            if (this.f15598a == c0504bu.f15598a && this.f15599b == c0504bu.f15599b && this.f15600c == c0504bu.f15600c && this.f15601d == c0504bu.f15601d && this.f15602e == c0504bu.f15602e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15598a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f15599b) * 1000003) ^ this.f15600c) * 1000003;
        long j2 = this.f15601d;
        return this.f15602e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f15598a);
        sb.append(", loadBatchSize=");
        sb.append(this.f15599b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f15600c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f15601d);
        sb.append(", maxBlobByteSizePerRow=");
        return c75.m3880l(sb, this.f15602e, "}");
    }
}
