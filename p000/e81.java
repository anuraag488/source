package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e81 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public static final e81 f17875a = new e81();

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f17876b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static void m4961a(yc3 yc3Var) {
        AtomicLong atomicLong;
        f17876b.incrementAndGet();
        int i = yc3Var.f35120c;
        for (int i2 = 0; i2 < i; i2++) {
            n83 n83Var = yc3Var.f35119b[i2];
            int i3 = n83Var.f25532b;
            if (i3 >= 0) {
                int i4 = i3 + 1;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ws2) ((ArrayList) n83Var.f25534d).get(i5)).getClass();
                }
                if (n83Var.f25532b >= 4) {
                    ArrayList arrayList = new ArrayList(4);
                    for (int i6 = 0; i6 < 4; i6++) {
                        arrayList.add(new ws2());
                    }
                    n83Var.f25534d = arrayList;
                }
                n83Var.f25532b = -1;
            }
            int i7 = n83Var.f25533c;
            if (i7 >= 0) {
                int i8 = i7 + 1;
                for (int i9 = 0; i9 < i8; i9++) {
                    ro1 ro1Var = (ro1) ((ArrayList) n83Var.f25535e).get(i9);
                    ro1Var.f29470a = null;
                    ro1Var.f29471b = null;
                    ro1Var.f29472c = -1;
                }
                if (n83Var.f25533c >= 4) {
                    ArrayList arrayList2 = new ArrayList(4);
                    for (int i10 = 0; i10 < 4; i10++) {
                        arrayList2.add(new ro1());
                    }
                    n83Var.f25535e = arrayList2;
                }
                n83Var.f25533c = -1;
            }
        }
        yc3Var.f35120c = 0;
        wc3 wc3Var = yc3Var.f35118a;
        C0461ao c0461ao = wc3Var.f33238d;
        if (wc3Var.f33235a && (atomicLong = wc3Var.f33237c) != null) {
            long j = atomicLong.get();
            atomicLong.compareAndSet(j, j - 1);
        }
        if (c0461ao.f14719c < 256) {
            c0461ao.addFirst(yc3Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        f17876b.set(0);
    }
}
