package com.icare.jetpackmvvm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.icare.jetpackmvvm.R;

public class ShapeFrameLayout extends FrameLayout implements IShapeDrawable<ShapeFrameLayout> {

    private int mShape;
    private int mShapeWidth;
    private int mShapeHeight;
    private int mSolidColor;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;

    private int mStartColor;
    private int mCenterColor;
    private int mEndColor;
    private boolean mUseLevel;
    private int mAngle;
    private int mGradientType;
    private float mCenterX;
    private float mCenterY;
    private int mGradientRadius;

    private int mStrokeColor;
    private int mStrokeWidth;
    private int mDashWidth;
    private int mDashGap;

    public ShapeFrameLayout(Context context) {
        this(context, null);
    }

    public ShapeFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShapeFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ShapeFrameLayout);
        mShape = typedArray.getInt(R.styleable.ShapeFrameLayout_shape, DEFAULT_SHAPE);
        mShapeWidth = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_width, DEFAULT_SHAPE_WIDTH);
        mShapeHeight = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_height, DEFAULT_SHAPE_HEIGHT);

        mSolidColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shape_solidColor, DEFAULT_SHAPE_SOLID_COLOR);
        int radius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_radius, DEFAULT_SHAPE_RADIUS);
        mTopLeftRadius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_topLeftRadius, radius);
        mTopRightRadius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_topRightRadius, radius);
        mBottomLeftRadius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_bottomLeftRadius, radius);
        mBottomRightRadius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_bottomRightRadius, radius);

        mStartColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shape_startColor, DEFAULT_SHAPE_START_COLOR);
        mCenterColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shape_centerColor, DEFAULT_SHAPE_CENTER_COLOR);
        mEndColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shape_endColor, DEFAULT_SHAPE_END_COLOR);
        mUseLevel = typedArray.getBoolean(R.styleable.ShapeFrameLayout_shape_useLevel, DEFAULT_SHAPE_USE_LEVEL);
        mAngle = (int) typedArray.getFloat(R.styleable.ShapeFrameLayout_shape_angle, DEFAULT_SHAPE_ANGLE);
        mGradientType = typedArray.getInt(R.styleable.ShapeFrameLayout_shape_gradientType, DEFAULT_SHAPE_GRADIENT_TYPE);
        mCenterX = typedArray.getFloat(R.styleable.ShapeFrameLayout_shape_centerX, DEFAULT_SHAPE_CENTER_X);
        mCenterY = typedArray.getFloat(R.styleable.ShapeFrameLayout_shape_centerX, DEFAULT_SHAPE_CENTER_Y);
        mGradientRadius = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_gradientRadius, radius);

        mStrokeColor = typedArray.getColor(R.styleable.ShapeFrameLayout_shape_strokeColor, DEFAULT_SHAPE_STROKE_COLOR);
        mStrokeWidth = typedArray.getDimensionPixelSize(R.styleable.ShapeFrameLayout_shape_strokeWidth, DEFAULT_SHAPE_STROKE_WIDTH);
        mDashWidth = (int) typedArray.getDimension(R.styleable.ShapeFrameLayout_shape_dashWidth, DEFAULT_SHAPE_DASH_WIDTH);
        mDashGap = (int) typedArray.getDimension(R.styleable.ShapeFrameLayout_shape_dashGap, DEFAULT_SHAPE_DASH_GAP);

        typedArray.recycle();

        if (getBackground() == null) {
            into();
        }
    }

    @Override
    public ShapeFrameLayout setShape(int shape) {
        mShape = shape;
        return this;
    }

    @Override
    public int getShape() {
        return mShape;
    }

    @Override
    public ShapeFrameLayout setShapeWidth(int width) {
        mShapeWidth = width;
        return this;
    }

    @Override
    public int getShapeWidth() {
        return mShapeWidth;
    }

    @Override
    public ShapeFrameLayout setShapeHeight(int height) {
        mShapeHeight = height;
        return this;
    }

    @Override
    public int getShapeHeight() {
        return mShapeHeight;
    }

    @Override
    public ShapeFrameLayout setSolidColor(int color) {
        mSolidColor = color;
        return this;
    }

    @Override
    public int getSolidColor() {
        return mSolidColor;
    }

    @Override
    public ShapeFrameLayout setTopLeftRadius(int radius) {
        mTopLeftRadius = radius;
        return this;
    }

    @Override
    public int getTopLeftRadius() {
        return mTopLeftRadius;
    }

    @Override
    public ShapeFrameLayout setTopRightRadius(int radius) {
        mTopRightRadius = radius;
        return this;
    }

    @Override
    public int getTopRightRadius() {
        return mTopRightRadius;
    }

    @Override
    public ShapeFrameLayout setBottomLeftRadius(int radius) {
        mBottomLeftRadius = radius;
        return this;
    }

    @Override
    public int getBottomLeftRadius() {
        return mBottomLeftRadius;
    }

    @Override
    public ShapeFrameLayout setBottomRightRadius(int radius) {
        mBottomRightRadius = radius;
        return this;
    }

    @Override
    public int getBottomRightRadius() {
        return mBottomRightRadius;
    }

    @Override
    public ShapeFrameLayout setStartColor(int color) {
        mStartColor = color;
        return this;
    }

    @Override
    public int getStartColor() {
        return mStartColor;
    }

    @Override
    public ShapeFrameLayout setCenterColor(int color) {
        mCenterColor = color;
        return this;
    }

    @Override
    public int getCenterColor() {
        return mCenterColor;
    }

    @Override
    public ShapeFrameLayout setEndColor(int color) {
        mEndColor = color;
        return this;
    }

    @Override
    public int getEndColor() {
        return mEndColor;
    }

    @Override
    public ShapeFrameLayout setUseLevel(boolean useLevel) {
        mUseLevel = useLevel;
        return this;
    }

    @Override
    public boolean isUseLevel() {
        return mUseLevel;
    }

    @Override
    public ShapeFrameLayout setAngle(int angle) {
        mAngle = angle;
        return this;
    }

    @Override
    public int getAngle() {
        return mAngle;
    }

    @Override
    public ShapeFrameLayout setGradientType(int type) {
        mGradientType = type;
        return this;
    }

    @Override
    public int getGradientType() {
        return mGradientType;
    }

    @Override
    public ShapeFrameLayout setCenterX(float x) {
        mCenterX = x;
        return this;
    }

    @Override
    public float getCenterX() {
        return mCenterX;
    }

    @Override
    public ShapeFrameLayout setCenterY(float y) {
        mCenterY = y;
        return this;
    }

    @Override
    public float getCenterY() {
        return mCenterY;
    }

    @Override
    public ShapeFrameLayout setGradientRadius(int radius) {
        mGradientRadius = radius;
        return this;
    }

    @Override
    public int getGradientRadius() {
        return mGradientRadius;
    }

    @Override
    public ShapeFrameLayout setStrokeColor(int color) {
        mStrokeColor = color;
        return this;
    }

    @Override
    public int getStrokeColor() {
        return mStrokeColor;
    }

    @Override
    public ShapeFrameLayout setStrokeWidth(int width) {
        mStrokeWidth = width;
        return this;
    }

    @Override
    public int getStrokeWidth() {
        return mStrokeWidth;
    }

    @Override
    public ShapeFrameLayout setDashWidth(int width) {
        mDashWidth = width;
        return this;
    }

    @Override
    public int getDashWidth() {
        return mDashWidth;
    }

    @Override
    public ShapeFrameLayout setDashGap(int gap) {
        mDashGap = gap;
        return this;
    }

    @Override
    public int getDashGap() {
        return mDashGap;
    }

    @Override
    public void into() {
        setBackground(build());
    }
}