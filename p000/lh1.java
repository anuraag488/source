package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lh1 {

    /* JADX INFO: renamed from: a */
    public static final lh1 f24030a = new lh1();

    /* JADX INFO: renamed from: b */
    public static final Map f24031b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: a */
    public static jh1 m7967a(o34 o34Var) {
        Object obj = f24031b.get(o34Var);
        if (obj != null) {
            return (jh1) obj;
        }
        wb1.m12192k("Cannot get dependency ", o34Var, ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:30:0x0099). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m7968b(p000.ym0 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p000.kh1
            if (r0 == 0) goto L13
            r0 = r10
            kh1 r0 = (p000.kh1) r0
            int r1 = r0.f23116B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23116B = r1
            goto L18
        L13:
            kh1 r0 = new kh1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r9 = r0.f23123z
            ap0 r10 = p000.ap0.f14763a
            int r1 = r0.f23116B
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L40
            if (r1 != r2) goto L3a
            java.lang.Object r1 = r0.f23122y
            java.util.Map r4 = r0.f23121x
            java.util.Map r4 = (java.util.Map) r4
            gx2 r5 = r0.f23120w
            o34 r6 = r0.f23119v
            java.util.Iterator r7 = r0.f23118u
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.util.Map r8 = r0.f23117t
            java.util.Map r8 = (java.util.Map) r8
            p000.k43.m7376J(r9)
            goto L99
        L3a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r9)
            return r3
        L40:
            p000.k43.m7376J(r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            java.util.Map r1 = p000.lh1.f24031b
            int r4 = r1.size()
            int r4 = p000.fq2.m5779K(r4)
            r9.<init>(r4)
            java.util.Set r1 = r1.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = r9
            r7 = r1
        L5e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lc7
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            o34 r6 = (p000.o34) r6
            java.lang.Object r9 = r9.getValue()
            jh1 r9 = (p000.jh1) r9
            gx2 r5 = r9.f22270a
            r9 = r4
            java.util.Map r9 = (java.util.Map) r9
            r0.f23117t = r9
            r8 = r7
            java.util.Iterator r8 = (java.util.Iterator) r8
            r0.f23118u = r8
            r0.f23119v = r6
            r0.f23120w = r5
            r0.f23121x = r9
            r0.f23122y = r1
            r0.f23116B = r2
            java.lang.Object r9 = r5.m6191e(r0)
            if (r9 != r10) goto L98
            return r10
        L98:
            r8 = r4
        L99:
            jh1 r9 = m7967a(r6)     // Catch: java.lang.Throwable -> Lc2
            kp0 r9 = r9.f22271b     // Catch: java.lang.Throwable -> Lc2
            if (r9 == 0) goto La9
            r5.m6193g(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L5e
        La9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "Subscriber "
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            r10.append(r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = " has not been registered."
            r10.append(r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lc2
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lc2
            throw r9     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r9 = move-exception
            r5.m6193g(r3)
            throw r9
        Lc7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh1.m7968b(ym0):java.lang.Object");
    }
}
