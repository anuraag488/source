package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e30 {

    /* JADX INFO: renamed from: a */
    public uw2 f17658a;

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0065 -> B:19:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m4914a(p000.jl3 r9, p000.ym0 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p000.d30
            if (r0 == 0) goto L13
            r0 = r10
            d30 r0 = (p000.d30) r0
            int r1 = r0.f16759z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16759z = r1
            goto L18
        L13:
            d30 r0 = new d30
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16757x
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f16759z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r8 = r0.f16756w
            int r9 = r0.f16755v
            java.lang.Object[] r2 = r0.f16754u
            jl3 r4 = r0.f16753t
            p000.k43.m7376J(r10)
            r10 = r4
            goto L68
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r8)
            r8 = 0
            return r8
        L37:
            p000.k43.m7376J(r10)
            uw2 r8 = r8.f17658a
            java.lang.Object[] r10 = r8.f32211a
            int r8 = r8.f32213c
            r2 = 0
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
        L45:
            if (r9 >= r8) goto L6a
            r4 = r2[r9]
            f30 r4 = (p000.f30) r4
            q r5 = new q
            r6 = 12
            r5.<init>(r6)
            r5.f28113b = r10
            java.lang.invoke.VarHandle.storeStoreFence()
            r0.f16753t = r10
            r0.f16754u = r2
            r0.f16755v = r9
            r0.f16756w = r8
            r0.f16759z = r3
            java.lang.Object r4 = p000.C0006a5.m70h(r4, r5, r0)
            if (r4 != r1) goto L68
            return r1
        L68:
            int r9 = r9 + r3
            goto L45
        L6a:
            ju4 r8 = p000.ju4.f22634a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e30.m4914a(jl3, ym0):java.lang.Object");
    }
}
