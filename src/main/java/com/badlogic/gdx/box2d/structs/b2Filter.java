package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

public final class b2Filter extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(36).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2Filter(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2Filter() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2Filter.b2FilterPointer asPointer() {
        return new b2Filter.b2FilterPointer(getPointer(), getsGCFreed());
    }

    public long categoryBits() {
        return (long) getValue(0);
    }

    public void categoryBits(long categoryBits) {
        setValue(categoryBits, 0);
    }

    public long maskBits() {
        return (long) getValue(1);
    }

    public void maskBits(long maskBits) {
        setValue(maskBits, 1);
    }

    public int groupIndex() {
        return (int) getValue(2);
    }

    public void groupIndex(int groupIndex) {
        setValue(groupIndex, 2);
    }

    public static final class b2FilterPointer extends StackElementPointer<b2Filter> {

        public b2FilterPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2FilterPointer() {
            this(1, true, true);
        }

        public b2FilterPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2Filter.b2FilterPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2Filter createStackElement(long ptr, boolean freeOnGC) {
            return new b2Filter(ptr, freeOnGC);
        }
    }
}